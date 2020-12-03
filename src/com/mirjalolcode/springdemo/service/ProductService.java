package com.mirjalolcode.springdemo.service;

import java.util.List;

import com.mirjalolcode.springdemo.entity.Product;

public interface ProductService {
	public List<Product> getProducts();

	public void saveProduct(Product theProduct);

	public Product getProduct(int theId);
}
