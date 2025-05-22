package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentUtil {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/ibm_db";
		String userName="root";
		String password="root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection(url, userName, password);
		return con;
	}
}
