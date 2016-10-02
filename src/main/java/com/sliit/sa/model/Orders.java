package com.sliit.sa.model;

public class Orders {
	
	private int orderId;
	private int userId;
	private int foodId;
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
	
	
	public int getFoodID()
	{
		return orderId;
	}
	
	public void setFoodId(int foodId)
	{
		this.foodId = foodId;
	}
	
	public int getOrderID()
	{
		return orderId;
	}
	
	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}
	
	public int getUserID()
	{
		return userId;
	}
	
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	
	public int getQtyID()
	{
		return userId;
	}
	
	public void setQtyId(int qty)
	{
		this.qty = qty;
	}

}
