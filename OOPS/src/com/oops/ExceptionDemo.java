package com.oops;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Connection Established");
		char c1='\uface';
		System.out.println(c1);
		try {
			int[] items= {1,2,0,6};
			int index=0;
			System.out.println(items[index]);
			System.out.println(items[index]/index);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOBE");
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("Connection terminated");
	}
}
