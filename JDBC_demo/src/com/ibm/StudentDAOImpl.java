package com.ibm;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAOImpl implements StudentDAO{
	@Override
	public int addStudent(Student student) {
		try {
			Connection con=StudentUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into student(name,grade,dob) values (?,?,?)");
			pstmt.setString(1, student.getName());
			pstmt.setString(2,String.valueOf(student.getGrade()));
			pstmt.setDate(3, Date.valueOf(student.getDob()));
			
			return pstmt.executeUpdate();
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
