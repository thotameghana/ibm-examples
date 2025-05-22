package com.oops;

class Person{
	String name;
	String email;
	public Person(){
		System.out.println("person()");
	}
	public Person(String name, String email){
		System.out.println("Person(name,email)");
		this.name=name;
		this.email=email;
	}
	void display() {
		System.out.println("-------Person Details---------");
		System.out.println("name: "+name+", Email: "+email);
	}
}
class Student extends Person{
	int rollNo;
	String grade;
	Student(){
		System.out.println("Student()");
	}
	Student(int rollNo,String name, String grade, String email){
		super(name,email);
		System.out.println("Student(rollNo,name,grade,email)");
		this.rollNo=rollNo;
		this.grade=grade;
	}
	@Override
	void display() {
		System.out.println("---------Student details------------");
		System.out.println("RollNo: "+rollNo+", Name: "+name+", Email: "+email+", grade: "+grade);
	}
}
class Employee extends Person{
	int eId;
	float salary;
	public Employee() {
		System.out.println("Employee()");
	}
	public Employee(int eId, String name, String email, float salary) {
		super(name,email);
		System.out.println("Employee(eid,name,email,salary)");
		this.eId=eId;
		this.salary=salary;
	}
	@Override
	void display() {
		System.out.println("----------Employee Details----------");
		System.out.println("EId: "+eId+", Name: "+name+", Email: "+email+", Salary: "+salary);
	}
	
}
public class Inheritance {
	public static void main(String[] args) {
		Person person1=new Person("Meghana","m@gmail.com");
		person1.display();
		System.out.println("______________________________________");
		Student student1=new Student(1,"Deepthi","A","d@gmail.com");
		student1.display();
		System.out.println("______________________________________");
		Employee employee1=new Employee(101,"Priya","p@gmail.com",38947.78f);
		employee1.display();
	}
}
