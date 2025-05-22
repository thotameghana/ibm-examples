package com.ibm.buisness;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.Employee;
import com.ibm.dao.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeDao;
	/*
	 * EmployeeRepo has below methods
	 * save(Employee e): saves or updates
	 * Optional<Employee> findById(int id): returns optional based on the primary key you pass
	 * List<Employee> findAll();
	 * void deleteById(int id);
	 */
	public List<Employee> findEmployees(){
		return employeeDao.findAll();
	}
	
	public Employee findEmployee(int id) throws Exception{
		Optional<Employee> optional = employeeDao.findById(id);
		return optional.orElseThrow(()-> new Exception ("Sorry id "+id+" is not found"));
	}
	
	public Employee saveOrUpdate(Employee employee) {
//		System.out.println(employee.getId());
		Employee savedEntity=null;
		if(employee.getId() == 0) {
			savedEntity= employeeDao.save(employee);
		} else {
			try {
			Employee existingEntity = findEmployee(employee.getId());
			existingEntity.setName(employee.getName());
			existingEntity.setDob(employee.getDob());
			savedEntity= employeeDao.save(existingEntity);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return savedEntity;
		
	}
	public void deleteEmployee(int id) throws Exception {
		Employee employee=findEmployee(id);// if the employee not present it will throw an Exception
		employeeDao.delete(employee);
	}
}
