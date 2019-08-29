package com.cg.employeeManagement.EmployeeManagement.dao;

import com.cg.employeeManagement.EmployeeManagement.Employee;

public interface EmployeeDao {
	public Employee addEmployee(Employee emp);
	public Employee[] shoeEmployee();
	//update remove search
	public Employee UpdateEmployee(int emp);
	public boolean removeEmployee(int id);
	public Employee searchEmployee(int id);
	

}
