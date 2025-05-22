package com.oops;

public class User {
	private int userId;
	private String name;
	public User() {

	}
	public User(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
	public void display() {
		System.out.println(userId+" "+name);
	}
	@Override
	public String toString() {
		return "UserId: "+userId+", Name: "+name;
	}
}
