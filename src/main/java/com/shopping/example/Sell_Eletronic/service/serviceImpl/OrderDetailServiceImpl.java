package com.shopping.example.Sell_Eletronic.service.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.example.Sell_Eletronic.entity.Order;
import com.shopping.example.Sell_Eletronic.entity.OrderDetail;
import com.shopping.example.Sell_Eletronic.repository.OrderDetailRepository;
import com.shopping.example.Sell_Eletronic.repository.OrderRepository;
import com.shopping.example.Sell_Eletronic.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findByUserorder(Long userId) {
        return orderRepository.findByUserid(userId);
    }

    @Override
    public List<OrderDetail> findByOrderId(Long orderId) {
        return orderDetailRepository.findByOrderId(orderId);
    }

    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public void delete(Long id) {
        orderDetailRepository.deleteById(id);
    }
}