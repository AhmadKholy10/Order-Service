package com.example.orderserivce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderserivce.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
