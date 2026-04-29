package com.shopping.example.Sell_Eletronic.service.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.example.Sell_Eletronic.entity.User;
import com.shopping.example.Sell_Eletronic.repository.UserRepository;
import com.shopping.example.Sell_Eletronic.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository repo;

	@Override
	public String register(User user) {
		// TODO Auto-generated method stub
		user.setRole("Customer");
		repo.save(user);
		return "Register Sccuess";
	}

	@Override
	public String login(String email, String password) {
		// TODO Auto-generated method stub
		Optional<User> user = repo.findByemail(email);
		if(user.isPresent()) {
			if(user.get().getPassword().equals(password));
			return "Login Sccuess";
		}
		return "Email Try Again";
	}

}
