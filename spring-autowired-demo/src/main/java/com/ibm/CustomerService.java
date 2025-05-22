package com.ibm;

public class CustomerService {
	private AccountDao accountDao;
	private CustomerDao customerDao;
	
	public CustomerService() {
		System.out.println("CustomerService() object is created");
	}
	public void testCustomerService() {
		
		System.out.println("CustomerService() method executed...");
        accountDao.testAccountDao();
        customerDao.testCustomerDao();
	}
}
