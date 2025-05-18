package com.app.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.dao.UserRepo;
import com.app.demo.model.User;
import com.app.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService{

@Autowired
private UserRepo userRepo;

@Override
public User getUserById(Integer userId) {
	
	
	Optional<User> user= this.userRepo.findById(userId);
	return user.get();

}

@Override
public List<User> getAllUser() {
	
	List<User> userList= this.userRepo.findAll();
	return userList;
}

}