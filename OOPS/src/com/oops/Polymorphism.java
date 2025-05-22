package com.oops;

public class Polymorphism {
	public static void displayDetails(Person person) {
		person.display();
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	public static long add(long a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee(101, "Priya", "p@gmail.com", 83473.8f);
		Student stu=new Student(1, "Riya", "r@gmail.com", "A");
		Person p=new Person("Raja", "raja@gmail.com");
		
		displayDetails(emp);
		displayDetails(stu);
		displayDetails(p);
	}
}
