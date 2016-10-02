package com.sliit.sa.service;

import java.util.List;

import com.sliit.sa.model.Orders;

public interface OrderDAO {

	public List<Orders> getAllPayments();
	
	public Orders findByID(int id);
	
	public void updatePrice(Orders order);
}
