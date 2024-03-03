package com.ben.orderservice.restclient;

import com.ben.orderservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "http://localhost:8087", naeme ="inventory-service")
public interface InventoryRestClient {
	@GetMapping("/api/products")
	public List<Product> getAllProducts();
}
