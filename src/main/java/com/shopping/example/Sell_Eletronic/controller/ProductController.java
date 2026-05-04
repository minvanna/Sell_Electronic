package com.shopping.example.Sell_Eletronic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shopping.example.Sell_Eletronic.entity.Product;
import com.shopping.example.Sell_Eletronic.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService service;

    // Show All Products
    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    // Find Product By Id
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // Add Product
    @PostMapping
    public Product save(@RequestBody Product product) {
        return service.save(product);
    }

    // Update Product
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id,
                          @RequestBody Product product) {
        return service.update(id, product);
    }

    // Delete Product
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
