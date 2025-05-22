package com.ibm;

public class AccountDao1 implements AccountDao {

	private DataSource dataSource;

	public AccountDao1() {
		System.out.println("AccountDao1() created,  datasource = " + dataSource);
	}

	public AccountDao1(DataSource dataSource) {
		System.out.println("AccountDao1(dataSource) created, datasource userName= " + dataSource.getUserName());
		this.dataSource = dataSource;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("setDataSource(dataSource) created,  datasource userName= " + dataSource.getUserName());
	}

	@Override
	public void testing() {
		// TODO Auto-generated method stub

		System.out.println("testing() in AccountDao1(), dataSource username= " + dataSource.getUserName());

	}
}
