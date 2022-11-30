package com.rupak.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rupak.model.Address;
import com.rupak.model.Customer;

@Repository
public interface AddressDAO extends JpaRepository<Address, Integer>{

	@Query("select a from Address a where a.city=?1")
	public List<Address> getAllCustomer(String city);
	
	
}
