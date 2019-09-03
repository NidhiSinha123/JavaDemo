package com.cg.Employee.Management.dao;

import com.cg.Employee.Management.dto.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee emp);
	public Employee updateEmployee(int id);
	public Employee removeEmployee(int id);
	public Employee searchEmployee(int id);
	public Employee[] showEmployee(Employee emp);
	
	
}
