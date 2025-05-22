package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAutowired {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		
		CustomerDao custdao =(CustomerDao)factory.getBean("customerDao");
		
		AccountDao accdao=(AccountDao)factory.getBean("accountDao");
		
		CustomerService custs=(CustomerService)factory.getBean("customerService");
		
		custs.testCustomerService();
	}
}
