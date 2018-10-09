package com.ecommerce.ecom.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecom.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public List<User> findAll();



	public User findOneByUserName(String username);

}