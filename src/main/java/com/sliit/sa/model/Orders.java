package com.sliit.sa.model;

public class Orders {
	
	private int userId;
	private int foodId;
	private int orderId;
	private int qty;
	
	public Orders() {
		this.userId = 0;
		this.foodId = 0;
		this.orderId = 0;
		this.qty = 0;
	}
	
	public Orders(int userId, int foodId, int orderId, int qty){
		this.userId = userId;
		this.foodId = foodId;
		this.orderId = orderId;
		this.qty = qty;
	}

}
