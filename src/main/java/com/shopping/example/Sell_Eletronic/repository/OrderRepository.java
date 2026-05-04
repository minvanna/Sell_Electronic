package com.shopping.example.Sell_Eletronic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.shopping.example.Sell_Eletronic.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserid(@Param("userid") Long userid);
}