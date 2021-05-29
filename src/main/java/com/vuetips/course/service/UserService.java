package com.vuetips.course.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vuetips.course.entities.User;
import com.vuetips.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User getById(Long id) {
		User user = userRepository.getById(id);
		return user;
	}
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	public List<User> getClientes(String nome) {
		return userRepository.getUsersByName(nome);
	}
}
