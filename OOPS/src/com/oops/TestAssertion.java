package com.oops;

import java.util.Scanner;

public class TestAssertion {
	public static void main(String[] args) {
		int age=0;
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter age");
			age=sc.nextInt();
		}
		assert(age>=18):"Age must not be less than 18";
		System.out.println("Done");
	}
}
