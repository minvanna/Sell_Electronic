package com.shopping.example.Sell_Eletronic.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.example.Sell_Eletronic.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByemail(String email);

}
