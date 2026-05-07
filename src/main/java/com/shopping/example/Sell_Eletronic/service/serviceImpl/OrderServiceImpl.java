package com.shopping.example.Sell_Eletronic.service.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.example.Sell_Eletronic.entity.Order;
import com.shopping.example.Sell_Eletronic.entity.OrderDetail;
import com.shopping.example.Sell_Eletronic.repository.OrderDetailRepository;
import com.shopping.example.Sell_Eletronic.repository.OrderRepository;
import com.shopping.example.Sell_Eletronic.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepo;  

    @Autowired
    private OrderDetailRepository orderDetailRepo;  

    @Override
    public List<Order> getAll() {
        return orderRepo.findAll();
    }

    @Override
    public Order checkout(Order order) {
        order.setStatus("PENDING");
        order.setOrderDate(LocalDateTime.now());
        return orderRepo.save(order);
    }

    @Override
    public List<Order> getuserById(Long userid) {
        return orderRepo.findByUserid(userid);
    }

    @Override
    public String cancel(Long id) {
        Order order = orderRepo.findById(id).orElse(null);
        if (order != null) {
            order.setStatus("CANCELLED");
            orderRepo.save(order);
            return "Order Cancelled Successfully";
        }
        return "Order Not Found";
    }

    @Override
    public List<OrderDetail> getorderdetail(Long orderid) {
        return orderDetailRepo.findByOrderId(orderid);
    }
}
