package com.shopping.example.Sell_Eletronic.service;

import java.util.List;

import com.shopping.example.Sell_Eletronic.entity.Category;

public interface CategoryService {
	public List<Category> getAll();
	public Category getById(Long id);
	public Category save(Category category);
	public Category update(Long id,Category newUsername);
	public String delete(Long id);

}
