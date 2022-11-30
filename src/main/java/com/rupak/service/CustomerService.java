package com.rupak.service;

import java.util.List;

import com.rupak.exception.AddressException;
import com.rupak.exception.CustomerException;
import com.rupak.model.Customer;

public interface CustomerService {
	
	
	public Customer addCustomer(Customer cust) throws CustomerException,AddressException;
	
	public Customer updateCustomer(Customer cust,String key) throws CustomerException,AddressException;
	
	public Customer removeCustomer(Integer customerId,String key) throws CustomerException;
	
	public Customer viewCustomer(Integer customerId,String key) throws CustomerException;
	
	public List<Customer> ViewAllCustomer(String city) throws CustomerException,AddressException;

}
