package com.capg.EmpMag.dao;

import com.capg.EmpMag.dto.Employee;

public interface EmployeeDaoInterface {
	public Employee addEmployee(Employee emp);
	public Employee[] shoeEmployee();
	//update remove search
	public Employee UpdateEmployee(int emp);
	public boolean removeEmployee(int id);
	public Employee searchEmployee(int id);
	

}
