package com.shopping.example.Sell_Eletronic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.example.Sell_Eletronic.entity.Category;
import com.shopping.example.Sell_Eletronic.service.CategoryService;
@RestController
@RequestMapping("/api/category")
public class CategoryController {
	@Autowired
	private CategoryService Cservice;
	@GetMapping
	public List<Category> getAll(){
		return Cservice.getAll();
		
	}
	@GetMapping("/{id}")
	public Category getById(@PathVariable Long id) {
		return Cservice.getById(id);
		
	}
	@PostMapping
	public Category save(@RequestBody Category category) {
		return Cservice.save(category);
		
	}
	@PutMapping("/{id}")
	public Category update(@PathVariable Long id , @RequestBody Category category) {
		return Cservice.update(id, category);
		
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		Cservice.delete(id);
		return "Mobile";
	}

}
