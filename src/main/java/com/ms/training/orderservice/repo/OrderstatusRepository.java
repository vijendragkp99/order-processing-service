package com.ms.training.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ms.training.orderservice.entity.Orderstatus;

public interface OrderstatusRepository extends JpaRepository<Orderstatus, String>
{
    @Transactional
    @Modifying
    @Query("update Orderstatus o set o.status = ?1 where o.orderid = ?2")
    int updateStatusByOrderid(String status, String orderid);
}