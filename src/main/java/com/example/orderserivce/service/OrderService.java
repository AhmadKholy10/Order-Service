package com.example.orderserivce.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderserivce.DTO.LineItemDTO;
import com.example.orderserivce.DTO.OrderDTO;
import com.example.orderserivce.model.LineItem;
import com.example.orderserivce.model.Order;
import com.example.orderserivce.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public void placeOrder(OrderDTO orderDTO) {
		Order order = new Order(UUID.randomUUID().toString());
		List<LineItem> items = orderDTO.getLineItemDTOs()
							  .stream()
							  .map(this::mapToItem)
							  .toList();
		order.setItems(items);
		orderRepository.save(order);
	}
	
	public LineItem mapToItem(LineItemDTO lineItemDTO) {
		LineItem item = new LineItem(lineItemDTO.getSkuCode(),
				lineItemDTO.getPrice(),
				lineItemDTO.getQuantity());
		return item;
	}

}
