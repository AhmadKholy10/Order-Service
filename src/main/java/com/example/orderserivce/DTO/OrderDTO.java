package com.example.orderserivce.DTO;

import java.util.List;

public class OrderDTO {
	
	private List<LineItemDTO> lineItemDTOs;
	
	
	public OrderDTO() {
		
	}
	public OrderDTO(List<LineItemDTO> lineItemDTOs) {
		this.lineItemDTOs = lineItemDTOs;
	}

	public List<LineItemDTO> getLineItemDTOs() {
		return lineItemDTOs;
	}

	public void setLineItemDTOs(List<LineItemDTO> lineItemDTOs) {
		this.lineItemDTOs = lineItemDTOs;
	}
	
	

}
