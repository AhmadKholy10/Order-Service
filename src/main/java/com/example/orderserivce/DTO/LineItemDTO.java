package com.example.orderserivce.DTO;

import java.math.BigDecimal;

public class LineItemDTO {
	private Long id;
	private String skuCode;
	private BigDecimal price;
	private int quantity;
	
	
	public LineItemDTO(String skuCode, BigDecimal price, int quantity) {
		super();
		this.skuCode = skuCode;
		this.quantity = quantity;
		this.price = price;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSkuCode() {
		return skuCode;
	}


	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public BigDecimal calculatePrice() {
		return BigDecimal.valueOf(quantity  * price.doubleValue());
	}
	
	
	
	

}
