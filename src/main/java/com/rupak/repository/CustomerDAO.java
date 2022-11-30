package com.rupak.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rupak.model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

	
	public Optional<Customer> findByMobileNumber(String mobileNumber);
}