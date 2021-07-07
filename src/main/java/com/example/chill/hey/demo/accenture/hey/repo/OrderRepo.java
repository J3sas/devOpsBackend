package com.example.chill.hey.demo.accenture.hey.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chill.hey.demo.accenture.hey.entity.OrderClass;

public interface OrderRepo extends JpaRepository<OrderClass, Long> {
	
	
	
	public OrderClass findOrderById (Long id);
	
}
