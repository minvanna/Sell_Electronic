package com.shopping.example.Sell_Eletronic.service.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.example.Sell_Eletronic.entity.Card;
import com.shopping.example.Sell_Eletronic.repository.CardRepository;
import com.shopping.example.Sell_Eletronic.service.CardService;
@Service
public class CardServiceImpl implements CardService{
	@Autowired
	private CardRepository Crepository;

	@Override
	public List<Card> getAll() {
		// TODO Auto-generated method stub
		return Crepository.findAll();
	}

	@Override
	public List<Card> findByUserId(Long id) {
		// TODO Auto-generated method stub
		return Crepository.findByUserid(id);
	}

	@Override
	public Card save(Card card) {
		// TODO Auto-generated method stub
		return Crepository.save(card);
	}

	@Override
	public Card update(Long id, Card newCards) {
		// TODO Auto-generated method stub
		Card cd = Crepository.findById(id).orElse(null);
		if(cd!=null) {
			cd.setUserid(newCards.getUserid());
			cd.setProductid(newCards.getProductid());
			cd.setQty(newCards.getQty());
			return Crepository.save(cd);
		}
		return null;
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		Crepository.deleteById(id);
		return "Delete By Id";
	}

}
