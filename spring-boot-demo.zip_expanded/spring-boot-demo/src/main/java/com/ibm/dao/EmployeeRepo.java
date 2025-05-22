package com.ibm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	@Query("select e from Employee e where e.name=?1")
	public List<Employee> findAllByName(String name);
	
}
