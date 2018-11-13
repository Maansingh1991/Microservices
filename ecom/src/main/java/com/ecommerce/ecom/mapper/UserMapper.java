package com.ecommerce.ecom.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.ecommerce.ecom.dto.UserDTO;
import com.ecommerce.ecom.entities.User;

@Mapper(componentModel="spring")
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper( UserMapper.class ); 

	
	UserDTO userToUserDTO(User user);
	
	
	User userDTOToUser(UserDTO userDTO);

}
