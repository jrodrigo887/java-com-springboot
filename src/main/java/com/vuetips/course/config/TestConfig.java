package com.vuetips.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vuetips.course.entities.Order;
import com.vuetips.course.entities.User;
import com.vuetips.course.entities.enums.OrderStatus;
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
		User user4 = new User(4L, "igor", "joao@gmail.com", "998999989", "654456987");
		User user5 = new User(5L, "joao", "ijr@gmail.com", "998999989", "654456987");
		User user6 = new User(6L, "joao", "jror@gmail.com", "998999989", "654456987");
		User user7 = new User(7L, "igor", "junioror@gmail.com", "998999989", "654456987");
		
		Order od1 = new Order(Instant.parse("2019-06-20T19:53:05Z"),OrderStatus.PAID ,user1);		
		Order od2 = new Order(Instant.parse("2019-06-20T19:53:05Z"), OrderStatus.CANCELED, user2);
		Order od3 = new Order(Instant.parse("2019-06-20T19:53:05Z"), OrderStatus.WAITING_PAIMENT, user3);
		Order od4 = new Order(Instant.parse("2019-06-20T19:53:05Z"), OrderStatus.DELIVERED, user4);
		Order od5 = new Order(Instant.parse("2019-06-20T19:53:05Z"), OrderStatus.SHIPPED, user4);
		Order od6 = new Order(Instant.parse("2019-06-20T19:53:05Z"), OrderStatus.PAID, user3);
		Order od7 = new Order(Instant.parse("2019-06-20T19:53:05Z"), OrderStatus.CANCELED, user2);
		Order od8 = new Order(Instant.parse("2019-06-20T19:53:05Z"), OrderStatus.SHIPPED, user1);
		
		userRepostiry.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7));
		orderRepository.saveAll(Arrays.asList(od1, od2,od3, od4, od6, od5, od7, od8));
		
	}
	
}
