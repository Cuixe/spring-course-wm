package com.walmart.api.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walmart.api.order.entry.Order;

public interface OrderRepository extends JpaRepository<Order, String> {

}
