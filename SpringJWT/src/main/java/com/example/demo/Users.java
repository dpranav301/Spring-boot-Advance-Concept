package com.example.demo;

public class Users {

	public String userId;
	public String name;
	public String email;
	public Users(String userId, String name, String email) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
