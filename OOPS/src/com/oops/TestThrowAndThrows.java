package com.oops;

import java.util.Scanner;

public class TestThrowAndThrows {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter a number");
			int num=sc.nextInt();
			if(num==0) {
				throw new ArithmeticException("Number can't be zero");
			}
			int result=20/num;
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		finally {
			sc.close();
		}
		System.out.println("Done");
	}
}
