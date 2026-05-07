package com.shopping.example.Sell_Eletronic.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.shopping.example.Sell_Eletronic.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    List<OrderDetail> findByOrderId(Long orderId);
    List<OrderDetail> findByProductId(Long productId);
}