package com.examples;

public class User {
	int id;
	static String name;
	public User(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println("Id: "+id+", name: "+name);
	}
}
