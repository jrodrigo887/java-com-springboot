package com.vuetips.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vuetips.course.entities.Order;
import com.vuetips.course.entities.User;
import com.vuetips.course.repositories.OrderRepository;
import com.vuetips.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepostiry;
	
	@Autowired
	private OrderRepository orderRepository;
	

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(1L, "Joao", "jhohnn@gmail.com", "998999989", "654456987");
		User user2 = new User(2L, "allan", "allan@gmail.com", "998999989", "654456987");
		User user3 = new User(3L, "noberto", "noberto@gmail.com", "998999989", "654456987");
		User user4 = new User(4L, "igor", "igor@gmail.com", "998999989", "654456987");
		
		Order od1 = new Order(Instant.parse("2019-06-20T19:53:05Z"), user1);		
		Order od2 = new Order(Instant.parse("2019-06-20T19:53:05Z"), user2);
		Order od3 = new Order(Instant.parse("2019-06-20T19:53:05Z"), user3);
		Order od4 = new Order(Instant.parse("2019-06-20T19:53:05Z"), user4);
		Order od5 = new Order(Instant.parse("2019-06-20T19:53:05Z"), user4);
		Order od6 = new Order(Instant.parse("2019-06-20T19:53:05Z"), user3);
		Order od7 = new Order(Instant.parse("2019-06-20T19:53:05Z"), user2);
		Order od8 = new Order(Instant.parse("2019-06-20T19:53:05Z"), user1);
		
		userRepostiry.saveAll(Arrays.asList(user1, user2, user3, user4));
		orderRepository.saveAll(Arrays.asList(od1, od2,od3, od4, od6, od5, od7, od8));
		
	}
	
}
