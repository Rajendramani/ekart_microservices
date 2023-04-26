package com.ekart.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ekart.orderservice.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
