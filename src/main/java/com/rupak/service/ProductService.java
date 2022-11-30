package com.rupak.service;

import java.util.List;

import com.rupak.exception.CategoryException;
import com.rupak.exception.ProductException;
import com.rupak.model.Product;

public interface ProductService {
	
	
	public Product addProduct(Product product)throws ProductException;

	public Product updateProduct(Product product) throws ProductException;
	
	public Product viewProduct(Integer productId) throws ProductException;
	
	public Product removeProduct(Integer productId) throws ProductException;
	
	public List<Product> viewProductByCategory(String cName) throws CategoryException,ProductException;
	
	public List<Product> viewAllProduct()throws ProductException;
}
