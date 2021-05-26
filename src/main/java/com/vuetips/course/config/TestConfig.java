package com.vuetips.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vuetips.course.entities.User;
import com.vuetips.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepostiry;
	

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(1L, "Joao", "jhohnn@gmail.com", "998999989", "654456987");
		User user2 = new User(2L, "maria", "maria@gmail.com", "998999989", "654456987");
		
		userRepostiry.saveAll(Arrays.asList(user1, user2));
		
	}
	
}
