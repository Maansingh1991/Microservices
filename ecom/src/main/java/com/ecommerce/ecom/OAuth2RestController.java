package com.ecommerce.ecom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuth2RestController {
	
	
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getData(){
		
		return "hello";
	}

}
