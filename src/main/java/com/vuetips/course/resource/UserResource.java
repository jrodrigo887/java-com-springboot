package com.vuetips.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuetips.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User us = new User(1L, "Maria", "Maria@gmail.com", "9999999", "123654");
		return ResponseEntity.ok().body(us);
	}
}
