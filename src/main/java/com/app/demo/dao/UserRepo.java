package com.app.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
