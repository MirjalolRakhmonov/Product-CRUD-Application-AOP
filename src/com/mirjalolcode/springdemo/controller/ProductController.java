package com.mirjalolcode.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mirjalolcode.springdemo.dao.ProductDAO;
import com.mirjalolcode.springdemo.entity.Product;

@Controller
@RequestMapping("/product")
public class ProductController {
	// product dao needs to be injected
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/list")
	public String listProducts(Model theModel) {
		// get product from the dao
		List<Product>theProducts=productDAO.getProducts();
		
		// add products to the model
		theModel.addAttribute("products", theProducts);
		
		return "list-products";
	}
}
