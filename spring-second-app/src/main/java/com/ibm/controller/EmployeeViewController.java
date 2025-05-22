package com.ibm.controller;
import java.time.LocalDate;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ibm.Employee;
import com.ibm.business.EmployeeService;
public class EmployeeViewController {
	/*
	 * In web appp u will have a controller and view seperate
	 * here main itself is view and controller
	 */
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		//get the service object which is having an id employeeService
		EmployeeService service=(EmployeeService)context.getBean("employeeService");
//		service.deleteEmployee(1223);
		
//		System.out.println("**** Invoking the saveEmployee ****");
//		
//		Employee emp=new Employee();
//		emp.setName("sachin");
//		emp.setDob(LocalDate.parse("1987-08-22"));
//		int status =service.saveEmployee(emp);
//		System.out.println("Status="+status);
		
//		System.out.println("**** Invoking the FindEmployee ****");
//		List<Employee> getall=service.getAll();
//		System.out.println(getall);
//		
		
		System.out.println("**** Invoking the FindEmployee ****");
		List<Employee> list=service.getAll();
		list.forEach(item -> System.out.println(item));
		
		//closing container
		ClassPathXmlApplicationContext container =(ClassPathXmlApplicationContext)context;
		container.close();
	}
}