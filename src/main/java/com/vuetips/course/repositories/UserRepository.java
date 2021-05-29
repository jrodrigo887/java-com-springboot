package com.vuetips.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuetips.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> getUsersByName(String name);
}
