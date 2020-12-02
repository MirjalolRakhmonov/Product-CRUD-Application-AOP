package com.mirjalolcode.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mirjalolcode.springdemo.dao.ProductDAO;
import com.mirjalolcode.springdemo.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	// need to inject product dao
	@Autowired
	private ProductDAO productDAO;
	
	@Override
	@Transactional
	public List<Product> getProducts() {
		return productDAO.getProducts();
	}

}
