package com.shopping.example.Sell_Eletronic.service;

import java.util.List;
import com.shopping.example.Sell_Eletronic.entity.Order;
import com.shopping.example.Sell_Eletronic.entity.OrderDetail;

public interface OrderDetailService {
    List<Order> findByUserorder(Long userId);
    List<OrderDetail> findByOrderId(Long orderId);
    OrderDetail save(OrderDetail orderDetail);
    void delete(Long id);
}