package com.example.scrum.repository;

import com.example.scrum.domain.Product;
import com.example.scrum.domain.ProductId;

public interface ProductRepository {
	public Product findById(ProductId id);
	public void addProduct(Product product);
}
