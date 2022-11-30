package com.rupak.service;

import java.util.List;

import com.rupak.dto.ProductDTO;
import com.rupak.exception.CartException;
import com.rupak.exception.CustomerException;
import com.rupak.exception.LoginException;
import com.rupak.exception.ProductException;
import com.rupak.model.Cart;

public interface CartService {

    public Cart addProductToCart(Integer productId, int quantity,String key) throws CartException, LoginException, ProductException,CustomerException ;
	
	public List<ProductDTO> removeProductFromCart(Integer productId,String key) throws CartException, ProductException, LoginException  ;
	
	public List<ProductDTO> updateProductQuantity(Integer productId,Integer quantity,String key) throws CartException, LoginException, ProductException ;
	
	public Cart removeAllProducts(String key) throws CartException, LoginException ;
	
	public List<ProductDTO> viewAllProducts(String key)  throws CartException, LoginException;
	
}
