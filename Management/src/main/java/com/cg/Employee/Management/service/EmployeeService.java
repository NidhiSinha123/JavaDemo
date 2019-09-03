package com.cg.Employee.Management.service;

import com.cg.Employee.Management.dto.Employee;

public interface EmployeeService {
public boolean addEmployee(Employee emp);
public Employee updateEmployee(int id);
public Employee removeEmployee(int id);
public Employee searchEmployee(int id);
public Employee[] showEmployee(Employee emp);
}
