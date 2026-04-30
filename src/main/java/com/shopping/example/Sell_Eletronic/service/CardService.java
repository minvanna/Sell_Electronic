package com.shopping.example.Sell_Eletronic.service;

import java.util.List;


import com.shopping.example.Sell_Eletronic.entity.Card;

public interface CardService {
    List<Card> getAll();
    List<Card> findByUserId(Long id);
    Card save(Card card);
    Card update(Long id , Card newCards);
    String delete(Long id);

}
