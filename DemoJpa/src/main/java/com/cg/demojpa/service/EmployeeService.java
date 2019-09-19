package com.cg.demojpa.service;

import java.util.List;

import com.cg.demojpa.dto.Employee;

public interface EmployeeService {
	public Employee save(Employee emp);
	public List<Employee> findAll();
	public void remove(Integer empId);
	public void updateSalary(Integer empId);
	public List<Employee> findBetweenSalary(double min, double max);

}
