package com.app.demo.service;

import java.util.List;

import com.app.demo.model.User;

public interface UserService {
	
	User getUserById(Integer userId);
	
	List<User> getAllUser();

}
