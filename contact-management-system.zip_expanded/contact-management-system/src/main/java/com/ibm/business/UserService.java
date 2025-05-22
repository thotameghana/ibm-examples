package com.ibm.business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.Employee;
import com.ibm.User;
import com.ibm.dao.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userDao;
	
	public User findUser(int id) throws Exception{
		Optional<User> user = userDao.findById(id);
		return user.orElseThrow(()-> new Exception ("Sorry id "+id+" is not found"));
	}
	
	public User saveUser(User user) {
		User savedEntity = userDao.save(user);
		return savedEntity;
	}
	
	public User updatePassword(User u) throws Exception{
		User user = findUser(u.getUserId());
        if (user == null) {
            throw new Exception("User with id " + user.getUserId() + " not found");
        }
        
        user.setPassword(u.getPassword());
        userDao.save(user);
        return user;
	}

}
