package com.shopping.example.Sell_Eletronic.service;

import com.shopping.example.Sell_Eletronic.entity.User;

public interface UserService {
	public String register(User user);
	public String login(String email , String password);

}
