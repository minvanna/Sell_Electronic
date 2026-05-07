package com.shopping.example.Sell_Eletronic.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.shopping.example.Sell_Eletronic.entity.Order;  // ✅ fix: Orders → Order

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUserid(Long userid);  

    @Query("SELECT SUM(o.totalprice) FROM Order o")  
    Double getTotalRevenue();

    long countByStatus(String status);
}