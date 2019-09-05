package com.cg.service;

import java.util.HashMap;

import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoImpl;
import com.cg.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao=new EmployeeDaoImpl();
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	public HashMap<Integer, Employee<Integer, Double>> showEmployee() {
		// TODO Auto-generated method stub
		return dao.showEmployee();
	}

	public boolean removeEmployee(int empid) {
		// TODO Auto-generated method stub
		return dao.removeEmployee(empid);
	}

	public HashMap<Integer, Employee<Integer, Double>> sortEmployee() {
		// TODO Auto-generated method stub
		return dao.sortEmployee();
	}

	public Employee searchEmployee(int empid) {
		// TODO Auto-generated method stub
		return dao.searchEmployee(empid);
	}

}
