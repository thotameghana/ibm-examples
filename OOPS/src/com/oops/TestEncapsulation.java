package com.oops;

public class TestEncapsulation {
	public static void main(String[] args) {
		User user=new User(101, "Megha");
		System.out.println(user.getUserId());
		System.out.println(user.getName());
		
		user.setName("Meghana");
		
		System.out.println(user.getUserId());
		System.out.println(user.getName());
		
		System.out.println(user);
	}
}
