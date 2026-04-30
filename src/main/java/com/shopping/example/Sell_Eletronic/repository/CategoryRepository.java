package com.shopping.example.Sell_Eletronic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.example.Sell_Eletronic.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
