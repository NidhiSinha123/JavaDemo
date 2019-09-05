package com.cg.service;

import java.util.HashMap;

import com.cg.dto.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public HashMap<Integer,Employee<Integer,Double>> showEmployee();
	public boolean removeEmployee(int empid);
	public HashMap<Integer,Employee<Integer,Double>> sortEmployee();
	public Employee searchEmployee(int empid);
}
