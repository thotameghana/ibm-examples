package com.ibm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
}
