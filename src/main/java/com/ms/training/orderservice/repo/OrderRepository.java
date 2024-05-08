package com.ms.training.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.training.orderservice.entity.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String>
{
    Order findByOrderid(String orderid);
    List<Order> findByOfferid(String offerid);

}