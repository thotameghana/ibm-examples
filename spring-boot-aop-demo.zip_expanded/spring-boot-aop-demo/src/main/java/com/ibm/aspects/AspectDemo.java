package com.ibm.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // this will be treated as an Aspect
@Component //register this object in the spring
public class AspectDemo {
	@Before("execution(* com.ibm.buisness.EmployeeService.*(..))")
	public void track() {
		System.out.println("____________track() is called______________");
	}
	
	@After("execution(* com.ibm.buisness.EmployeeService.*(..))")
	public void track2() {
		System.out.println("____________track2() is called______________");
	}
}
