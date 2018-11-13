package com.ecommerce.ecom.services;

import java.util.List;
import com.ecommerce.ecom.entities.User;

public interface UserService {
	
	
	
	void add(User user);
	User update();
	void delete(long id);
	User getUserById(int id);
	List<User> getAllUsers();
	

}
