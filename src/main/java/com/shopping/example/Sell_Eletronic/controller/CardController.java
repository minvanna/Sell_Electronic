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

import com.shopping.example.Sell_Eletronic.entity.Card;
import com.shopping.example.Sell_Eletronic.service.CardService;

@RestController
@RequestMapping("/api/card")
public class CardController {
	@Autowired
	private CardService Cservice;
	@GetMapping
	public List<Card> getAll(){
		return Cservice.getAll();
	}
	@GetMapping("/user/{id}")
	public List<Card> findByUserId(@PathVariable Long id){
		return Cservice.findByUserId(id);
	}
	@PostMapping
	public Card save(@RequestBody Card card) {
		return Cservice.save(card);
	}
	@PutMapping("/{id}")
	public Card update(@PathVariable Long id , @RequestBody Card newCard) {
		return Cservice.update(id, newCard);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		Cservice.delete(id);
		return "Delete By Id";
	}

}
