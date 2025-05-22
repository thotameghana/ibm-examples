package com.ibm;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//DAO layer that will have only db logic
public class EmployeeDAO {
	
	public int saveEmployee(Employee employee) { // employee [id = 0, name = "Raj", dob = "2000-10-11" ]
		int status = 0;
		try {
			Connection con = DBUtil.establishConnection();
			String query = "insert into employee(name, dob) values(?, ?)";
			// Statement.RETURN_GENERATED_KEYS will return the generated key when insert is executed
			PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, employee.getName()); 
			statement.setDate(2, Date.valueOf(employee.getDob())); //java.sql.Date.valueOf(LocalDate)
			statement.executeUpdate();
			
			// to get that auto-generated key 
			ResultSet result = statement.getGeneratedKeys();
			while(result.next()) {
				status = result.getInt(1);
			}
			statement.close();
			
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	//get All the employee objects and return in List<Employee
	
	public List<Employee> findAllEmployees(){
		List<Employee> list=new ArrayList<>();//from java 7 onwords no need to specify type in right side
		//JDBC code goes here
		
		try {
			
			Connection con=DBUtil.establishConnection();
			String query="select * from employee";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			ResultSet resultSet=pstmt.executeQuery();
			
			while(resultSet.next()) {
				Employee e=new Employee(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getDate("dob").toLocalDate());
				list.add(e);
			}
			
			resultSet.close();
			pstmt.close();
			con.close();
			
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
