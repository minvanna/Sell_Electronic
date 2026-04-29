package com.shopping.example.Sell_Eletronic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.example.Sell_Eletronic.entity.User;
import com.shopping.example.Sell_Eletronic.service.UserService;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	@Autowired
	private UserService service;
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		return service.register(user);
		
	}
	@PostMapping("/login")
	public String login(@RequestParam String email , @RequestParam String password) {
		return service.login(email, password);
		
	}
}
