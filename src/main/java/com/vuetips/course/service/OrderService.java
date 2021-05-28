package com.vuetips.course.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vuetips.course.entities.Order;
import com.vuetips.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Order getById(Long id) {
		Order order = orderRepository.getById(id);
		return order;
	}
	
	public List<Order> getOrders() {
		return orderRepository.findAll();
	}
}
