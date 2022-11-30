package com.rupak.service;

import java.util.List;

import com.rupak.exception.AddressException;
import com.rupak.exception.CustomerException;
import com.rupak.exception.LoginException;
import com.rupak.model.Address;

public interface AddressService {
	
	
	public Address addAddress(Address add,String key) throws AddressException,LoginException,CustomerException; 

	public Address updateAddress(Address add,String key) throws AddressException,LoginException;
	
	public Address removeAddress(Integer addressId,String key) throws AddressException,LoginException;
	
	public List<Address> viewAllAddress(String key) throws AddressException,LoginException;
	
	public List<Address> viewAllAddress() throws AddressException;
}
