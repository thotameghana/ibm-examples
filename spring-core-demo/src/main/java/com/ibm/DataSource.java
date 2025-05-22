package com.ibm;

public class DataSource {
	
	private String userName;
	private String password;
	
	public DataSource() {
		System.out.println("DataSource object created");
	}

	public DataSource(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		System.out.println("DataSource(userName, password) object created");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("setUserName: "+userName);
		this.userName = userName;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setPassword: "+password);
		this.password = password;
	}

	public void setPassowrd(String passowrd) {
		System.out.println("setPassword: "+passowrd);
		this.password = passowrd;
	}

	@Override
	public String toString() {
		return "DataSource [userName=" + userName + ", passowrd=" + password + "]";
	}
	
	
}
