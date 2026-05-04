package com.shopping.example.Sell_Eletronic.service.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.example.Sell_Eletronic.entity.Order;
import com.shopping.example.Sell_Eletronic.repository.OrderRepository;
import com.shopping.example.Sell_Eletronic.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository Orepo;

    @Override
    public List<Order> getAll() {
        return Orepo.findAll();
    }

    @Override
    public Order checkout(Order order) {
        order.setStatus("Pending");
        order.setOrderDate(LocalDateTime.now());
        return Orepo.save(order);
    }

    @Override
    public List<Order> getuserById(Long userid) {
        return Orepo.findByUserid(userid);  
    }

    @Override
    public String cancel(Long id) {  
        Order order = Orepo.findById(id).orElse(null);

        if (order != null) {
            order.setStatus("Cancel");
            Orepo.save(order);
            return "Order Cancel Success";
        }

        return "Order Not Found";
    }
}
