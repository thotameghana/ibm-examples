package com.examples;

public class Main {

	public static void main(String[] args) throws Exception {
		User user1=new User(100,"Virat");
		User user2=new User(200,"Rohith");
		
		user1.display();
		user2.display();
		System.out.println(user1.name);
		int x=20;
		int y=x++;
		System.out.println(y);
		
	}
}
