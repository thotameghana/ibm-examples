package com.meghana;

public class Employee {
	private int empId;
	private String name;
	private String email;
	private float salary;
	private String address;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId,String name,String email,float salary,String address) {
		this.empId=empId;
		this.name=name;
		this.email=email;
		this.salary=salary;
		this.address=address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", salary=" + salary + ", address="
				+ address + "]";
	}
}
