package com.rupak.service;

import java.time.LocalDate;
import java.util.List;

import com.rupak.dto.OrderDTO;
import com.rupak.exception.AddressException;
import com.rupak.exception.CartException;
import com.rupak.exception.LoginException;
import com.rupak.exception.OrderException;
import com.rupak.exception.ProductException;
import com.rupak.model.Orders;

public interface OrderService {

	
	public Orders addOrder(OrderDTO order, String key) throws OrderException, CartException, LoginException,ProductException;
	public Orders updateOrder(OrderDTO order, String key,Integer orderId) throws OrderException, LoginException;
	public Orders removeOrder(Integer oriderId, String key) throws OrderException,LoginException;
	public Orders viewOrder(Integer orderId) throws OrderException;
	public List<Orders> viewAllOrdersByDate(String date) throws OrderException;
	public List<Orders> viewAllOrdersByLocation(String city) throws OrderException, AddressException;
	public List<Orders> viewAllOrdersByUserId(Integer userid) throws OrderException;
}
