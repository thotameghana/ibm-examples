package com.oops;

import java.io.Closeable;
import java.io.IOException;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException() {
		super();
	}

	public EmployeeNotFoundException(String message) {
		super(message);
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Employee Not Found";
	}

	
}
