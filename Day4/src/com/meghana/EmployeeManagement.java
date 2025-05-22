package com.meghana;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeManagement {
	static void printEmployeeList(Collection<Employee> employeeList) {
		Iterator<Employee> itr=employeeList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Comparator<Employee> sortByEmpidAsc= (x,y)->Integer.compare(x.getEmpId(),y.getEmpId());
		Comparator<Employee> sortByNameAsc=new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
			
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Comparator<Employee> sortByEmailAsc=(x,y)->x.getName().compareTo(y.getName());
		Comparator<Employee> sortBySalaryAsc=(x,y)->Float.compare(x.getSalary(), y.getSalary());
		Comparator<Employee> sortByAddressAsc=(x,y)->x.getAddress().compareTo(y.getAddress());
		
		
		
		System.out.println("Enter your choice.....");
		System.out.println("1.Sort based on empId Asc\n 2.Name based on Asc\n 3.email based on Asc\n 4.Salary based on Asc\n 5.Address based on Asc" );
		int choice=sc.nextInt();
		Comparator<Employee> comp = null;
		switch(choice) {
		case 1:
			comp=sortByEmpidAsc;
			break;
		case 2:
			comp=sortByNameAsc;
			break;
		case 3:
			comp=sortByEmailAsc;
			break;
		case 4:
			comp=sortBySalaryAsc;
			break;
		case 5:
			comp=sortByAddressAsc;
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	
		Set<Employee> employeeSet=new TreeSet<>(comp);
		employeeSet.add(new Employee(88, "Nithish Reddy", "n@gmail.com", 9800000.23f, "HYD"));
		employeeSet.add(new Employee(18, "Virat", "v@gmail.com", 6734234.0f, "BGl"));
		employeeSet.add(new Employee(45, "Rohith", "r@gmail.com", 877234.0f, "Delhi"));
		employeeSet.add(new Employee(77, "Gill", "g@gmail.com", 3487234.0f, "Pune"));
		employeeSet.add(new Employee(33, "Hardhik", "h@gmail.com", 987234.0f, "Mumbai"));
		
		printEmployeeList(employeeSet);
	}
	
}
