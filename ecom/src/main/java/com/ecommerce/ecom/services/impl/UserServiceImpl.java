package com.ecommerce.ecom.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.ecom.entities.User;
import com.ecommerce.ecom.mapper.UserMapper;
import com.ecommerce.ecom.repositories.UserRepository;
import com.ecommerce.ecom.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
//	@Autowired
//	UserMapper userMapper; TODO: need to debug this issue

	
	

	@Override
	public void add(User user) {
		
		UserMapper.INSTANCE.userToUserDTO(user);
		
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		userRepository.save(user);
		
	}

	@Override
	public User update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		
		return userRepository.findOneById(id);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
