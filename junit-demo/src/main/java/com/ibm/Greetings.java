package com.ibm;

public class Greetings {
	public String welcome(String name) {
		return "Welcome "+name;
	}
	public static String welcomeUpperCase(String name) {
		return "WELCOME "+name.toUpperCase();
	}
	public boolean isEven(int n) {
		if(n<=0) {
			throw new RuntimeException("Number must not be zero or negative");
		}
		return n%2==0;
	}
}
