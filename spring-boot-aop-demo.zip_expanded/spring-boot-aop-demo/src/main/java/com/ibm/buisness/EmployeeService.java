package com.ibm.buisness;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private int id;
	//you want to invoke a cross cutting concern before or after invoking this methods
	//then AOP provides you some techniques like Aspects, Advice, Point cut, Join point
	//findAll is a join point
	public void findAll() {
		System.out.println("__________findAll() is called__________");
	}
	public int getId() {
		System.out.println("________________Getter method________________");
		return id;
	}
	public void setId(int id) {
		System.out.println("________________Setter method________________");
		this.id = id;
	}
	
}
