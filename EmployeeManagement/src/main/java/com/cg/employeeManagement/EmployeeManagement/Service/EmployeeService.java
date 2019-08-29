package com.cg.employeeManagement.EmployeeManagement.Service;

import com.cg.employeeManagement.EmployeeManagement.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public Employee[] showEmployee();
	public Employee UpdateEmployee(int id);
	public boolean removeEmployee(int id);
	
	
}
