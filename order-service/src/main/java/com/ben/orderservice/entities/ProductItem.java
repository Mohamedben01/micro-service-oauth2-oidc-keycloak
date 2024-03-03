package com.ben.orderservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductItem {
	@Id
	private Long id;
	private String productId;
	private double price;
	private int quantity;
	@ManyToOne
	private Order order;
}
