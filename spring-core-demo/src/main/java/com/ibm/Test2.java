package com.ibm;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test2 implements InitializingBean, DisposableBean{
	
	public Test2() {
		System.out.println("Test2() object is created");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() from test2_____ DisposableBean");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() from Test2_______InitializongBean");
	}
	
}
