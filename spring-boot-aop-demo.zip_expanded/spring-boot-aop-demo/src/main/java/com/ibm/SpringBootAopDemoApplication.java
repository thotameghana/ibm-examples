package com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ibm.buisness.EmployeeService;

@SpringBootApplication
public class SpringBootAopDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootAopDemoApplication.class, args);
		
		System.out.println("*********************************************");
		
		//(EmployeeService.class) - works as long as one instance of EmployeeService is available in the spring IOC
		EmployeeService service= context.getBean(EmployeeService.class);
		service.findAll();
		service.getId();
		service.setId(1);
		
		System.out.println("*********************************************");
	}

}
