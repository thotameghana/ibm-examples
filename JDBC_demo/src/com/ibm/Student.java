package com.ibm;

import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private char grade;
	private LocalDate dob;
	public Student() {

	}
	public Student(int id, String name, char grade, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.dob = dob;
	}
	public Student(String name, char grade, LocalDate dob) {
		super();
		this.name = name;
		this.grade = grade;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", dob=" + dob + "]";
	}
	
}
