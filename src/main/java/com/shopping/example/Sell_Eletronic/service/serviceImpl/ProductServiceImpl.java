package com.shopping.example.Sell_Eletronic.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.example.Sell_Eletronic.entity.Product;
import com.shopping.example.Sell_Eletronic.repository.ProductRepository;
import com.shopping.example.Sell_Eletronic.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository Prepo;
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return Prepo.findAll();
	}

	@Override
	public Product getById(Long id) {
		// TODO Auto-generated method stub
		return Prepo.findById(id).orElse(null);
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return Prepo.save(product);
	}

	@Override
	public Product update(Long id, Product newProduct) {
		// TODO Auto-generated method stub
		Product pduct = Prepo.findById(id).orElse(null);
		if(pduct!=null) {
			pduct.setName(newProduct.getName());
			pduct.setBrand(newProduct.getBrand());
			pduct.setPrice(newProduct.getPrice());
			pduct.setQty(newProduct.getQty());
			pduct.setDescription(newProduct.getDescription());
			pduct.setImage(newProduct.getImage());
			pduct.setCategory_Id(newProduct.getCategory_Id());
			return Prepo.save(pduct);
		}
		return null;
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		Prepo.deleteById(id);
		return "Delete Sccuess";
	}

}
