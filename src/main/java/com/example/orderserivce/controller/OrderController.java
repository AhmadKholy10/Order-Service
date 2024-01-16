package com.example.orderserivce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderserivce.DTO.OrderDTO;
import com.example.orderserivce.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public ResponseEntity<String> placeOrder(@RequestBody OrderDTO orderDTO){
		orderService.placeOrder(orderDTO);
		return new ResponseEntity<String>("Order placed successfully", HttpStatus.CREATED);
		
		
	}

}
