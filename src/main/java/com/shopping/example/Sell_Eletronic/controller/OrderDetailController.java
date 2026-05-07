package com.shopping.example.Sell_Eletronic.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shopping.example.Sell_Eletronic.entity.OrderDetail;
import com.shopping.example.Sell_Eletronic.service.OrderDetailService;

@RestController
@RequestMapping("/api/orderdetails") 
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;
    @GetMapping("/order/{orderId}")
    public ResponseEntity<List<OrderDetail>> getByOrderId(@PathVariable Long orderId) {
        return ResponseEntity.ok(orderDetailService.findByOrderId(orderId));
    }
    @PostMapping
    public ResponseEntity<OrderDetail> create(@RequestBody OrderDetail orderDetail) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderDetailService.save(orderDetail));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        orderDetailService.delete(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
