package com.capg.EmpMag.service;

import com.capg.EmpMag.dto.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public Employee[] showEmployee();
	public Employee UpdateEmployee(int id);
	public boolean removeEmployee(int id);

}
