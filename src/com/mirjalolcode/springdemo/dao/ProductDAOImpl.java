package com.mirjalolcode.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mirjalolcode.springdemo.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	// Session factory needs to be injected
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Product> getProducts() {
		// get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		
		// create a query
		Query<Product> theQuery=currentSession.createQuery("from Product", Product.class);
		
		// execute query and get result
		List<Product> products=theQuery.getResultList();
		
		return products;
	}

}
