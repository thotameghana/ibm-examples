package com.ibm;

import java.time.LocalDate;

public class Launch {
	public static void main(String[] args) {
		StudentDAO sdi=new StudentDAOImpl();
		
		//insert
		Student s=new Student("Arhaa", 'A', LocalDate.parse("2008-08-30"));
		
		if(sdi.addStudent(s)!=0) {
			System.out.println("Added Sucessfully");
		}
		else {
			System.out.println("Unable to add");
		}
	}
}
