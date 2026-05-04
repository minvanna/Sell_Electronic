package com.shopping.example.Sell_Eletronic.service;

import java.util.List;

import com.shopping.example.Sell_Eletronic.entity.Order;

public interface OrderService {
    List<Order> getAll();
    
    Order checkout(Order order);
    
    List<Order> getuserById(Long userid);
    
    String cancel(Long id);  
}