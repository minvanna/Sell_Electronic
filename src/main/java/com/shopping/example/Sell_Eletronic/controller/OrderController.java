package com.shopping.example.Sell_Eletronic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.example.Sell_Eletronic.entity.Order;
import com.shopping.example.Sell_Eletronic.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    
    @Autowired
    private OrderService Oservice;

    @GetMapping
    public List<Order> getAll() {
        return Oservice.getAll();
    }

    @PostMapping("/checkout")
    public Order checkout(@RequestBody Order order) {
        return Oservice.checkout(order);
    }

    @GetMapping("/history/{userid}")
    public List<Order> getByUserId(@PathVariable Long userid) {
        return Oservice.getuserById(userid);
    }

    @GetMapping("/cancel/{id}")  
    public String cancel(@PathVariable Long id) {
        return Oservice.cancel(id); 
    }
}
