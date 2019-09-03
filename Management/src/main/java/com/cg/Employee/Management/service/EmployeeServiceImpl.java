package com.cg.Employee.Management.service;

import com.cg.Employee.Management.dao.EmployeeDao;
import com.cg.Employee.Management.dao.EmployeeDaoImpl;
import com.cg.Employee.Management.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao dao=new EmployeeDaoImpl();
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.addEmployee(emp);
		return true;
	}

	public Employee updateEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(id);
	}

	public Employee removeEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.removeEmployee(id);
	}

	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.searchEmployee(id);
	}

	public Employee[] showEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.showEmployee(emp);
	}

}
