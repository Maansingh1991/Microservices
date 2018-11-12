package com.ecommerce.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecom.entities.User;
import com.ecommerce.ecom.services.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void addUser(User user){
		
		
		
		 userService.add(user);
		
	}
	
	

}
