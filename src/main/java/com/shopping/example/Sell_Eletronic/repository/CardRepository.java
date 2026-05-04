package com.shopping.example.Sell_Eletronic.repository;









import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.example.Sell_Eletronic.entity.Card;

public interface CardRepository extends JpaRepository<Card, Long>{
	List<Card> findByUserid(Long userid);

}
