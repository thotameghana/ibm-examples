package com.ibm.business;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.Employee;
import com.ibm.dao.EmployeeRepo;
@Service    //bean id="employeeService " this default name because we didnot mention any name
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeDao;
	
	public void deleteEmployee(int id) {
	
	}
	
	public int saveEmployee(Employee employee) {
		int status=employeeDao.save(employee);
		return status;
		
	}
	
	public List<Employee> getAll() {
		List<Employee> num=employeeDao.findAll();
		return num;
	}
}