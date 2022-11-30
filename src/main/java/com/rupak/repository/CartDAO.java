package com.rupak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rupak.model.Cart;
import com.rupak.model.Customer;
@Repository
public interface CartDAO extends JpaRepository<Cart, Integer>{

	
	public Cart findByCustomer(Customer customer);
}
