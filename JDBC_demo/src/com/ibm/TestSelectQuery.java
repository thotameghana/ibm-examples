package com.ibm;

import java.time.LocalDate;
import java.util.List;

public class TestSelectQuery {
	public static void main(String[] args) {
		EmployeeDAO employeeDao=new EmployeeDAO();
		
		Employee emp = new Employee(0, "Arjun", LocalDate.parse("2020-11-30"));
		int id = employeeDao.saveEmployee(emp);
		System.out.println("ID created is : "+id);
		
		List<Employee> list=employeeDao.findAllEmployees();
		
		for(Employee e:list) {
			System.out.println(e);
		}
	}
}
