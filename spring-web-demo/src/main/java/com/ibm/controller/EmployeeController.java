package com.ibm.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.Employee;
import com.ibm.business.EmployeeService;

@Controller
@RequestMapping(path = "/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(path="/save", method = RequestMethod.POST)
	public ModelAndView store(@RequestParam("name") String name, @RequestParam("dob") String dob) {
		Employee emp=new Employee(0,name, LocalDate.parse(dob));
		int status=service.saveEmployee(emp);
		return new ModelAndView("hello","msg","Row affected: "+status);
	}
	
	@RequestMapping(path = "/testing", method = RequestMethod.GET)
	public ModelAndView greet() {
		
		List<Employee> list=service.getAll();
		//ModelAndView(viewName, key, model)
		ModelAndView modelView=new ModelAndView("display","msg",list);
		
		return modelView;
	}
}
