package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContainer {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		
		DataSource ds=(DataSource)factory.getBean("ds");
		System.out.println("Username: "+ds.getUserName());
		System.out.println("Password: "+ds.getPassword());
		
		System.out.println("-----------------------------------");
		
		DataSource ds2=(DataSource) factory.getBean("ds2");
		
		System.out.println("Username: "+ds2.getUserName());
		System.out.println("Username: "+ds2.getPassword());
		
		System.out.println("-----------------------------------");
		
		AccountDao1 ds3=(AccountDao1) factory.getBean("accountdao");
		
		System.out.println(ds3.getDataSource());
		
		Test t1 = (Test)factory.getBean("test");
		
		Test2 t2=(Test2)factory.getBean("test2");
		
		Locations cities= (Locations)factory.getBean("locations");
		
		System.out.println("Cities:  "+cities.getCities());
		
		Locations l = (Locations)factory.getBean("l");
		System.out.println("Cities:  "+l.getCities());
		
		((AbstractApplicationContext) factory).close();
	}
}
