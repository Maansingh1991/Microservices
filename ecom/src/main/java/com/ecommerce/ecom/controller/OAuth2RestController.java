package com.ecommerce.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecom.repositories.UserRepository;

@RestController
public class OAuth2RestController {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getData(){
		
	
		return "hello";
	}

}
