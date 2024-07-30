package com.raziel.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.raziel.springboot.model.User;
import com.raziel.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
