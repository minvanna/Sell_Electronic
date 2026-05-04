package com.shopping.example.Sell_Eletronic.service;

import java.util.List;

import com.shopping.example.Sell_Eletronic.entity.Product;

public interface ProductService {
	public List<Product> getAll();
	public Product getById(Long id);
	public Product save(Product product);
	public Product update(Long id,Product newProduct);
	public String delete(Long id);
}
