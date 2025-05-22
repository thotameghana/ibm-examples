package com.oops;

import java.util.Scanner;

public class TestCustomException {
	public static String find(int id) throws EmployeeNotFoundException{
		if(id<=0) {
			throw new EmployeeNotFoundException("Employee not found with that id");
		}
		return "Hello "+id;
	}
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter empId");
			int id=sc.nextInt();
			System.out.println(find(id));
		}
		catch(EmployeeNotFoundException | ArithmeticException  e) {
			System.out.println(e.getMessage());
		}
	}
}
