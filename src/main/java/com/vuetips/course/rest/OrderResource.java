package com.vuetips.course.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuetips.course.entities.Order;
import com.vuetips.course.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> orders = orderService.getOrders();
		return ResponseEntity.ok().body(orders);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> getById(@PathVariable Long id) {
		Order order = orderService.getById(id);
		
		return ResponseEntity.ok().body(order);
	}
}
