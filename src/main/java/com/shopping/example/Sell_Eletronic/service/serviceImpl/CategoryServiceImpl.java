package com.shopping.example.Sell_Eletronic.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.example.Sell_Eletronic.entity.Category;
import com.shopping.example.Sell_Eletronic.repository.CategoryRepository;
import com.shopping.example.Sell_Eletronic.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepository Catepo;
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return Catepo.findAll();
	}

	@Override
	public Category getById(Long id) {
		// TODO Auto-generated method stub
		return Catepo.findById(id).orElse(null);
	}

	@Override
	public Category save(Category category) {
		// TODO Auto-generated method stub
		return Catepo.save(category);
	}

	@Override
	public Category update(Long id, Category newUsername) {
		// TODO Auto-generated method stub
		Category F45 = Catepo.findById(id).orElse(null);
		if(F45!=null) {
			F45.setId(newUsername.getId());
			F45.setName(newUsername.getName());
			return Catepo.save(newUsername);
		}
		return null;
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		Catepo.deleteById(id);
		return "Mobile";
	}

}
