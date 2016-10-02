package com.sliit.sa.model;

public class Users {

	private int userId;
	private String username;
	private String role;
	
	public Users() {
		this.userId = 0;
	}

	public Users(int userId, String username, String role){
		this.userId = userId;
		this.username = username;
		this.role = role;
	}
	
	public Boolean findByID(int id)
	{
		return userId == this.userId;
	}
	
	public int getID()
	{
		return userId;
	}
	
	public void setID(int userId)
	{
		this.userId = userId;
	}
	
	public String getUserName()
	{
		return username;
	}
	
	public void setUserName(String username)
	{
		this.username = username;
	}
	
	public String getRole()
	{
		return role;
	}
	
	public void setRole(String role)
	{
		this.role = role;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Users))
			return false;
		Users other = (Users) obj;
		if (userId != other.userId)
			return false;
		return true;
	}
	
}
