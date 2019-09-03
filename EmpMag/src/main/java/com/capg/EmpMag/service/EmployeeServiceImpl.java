package com.capg.EmpMag.service;

import com.capg.EmpMag.dao.EmployeeDao;
import com.capg.EmpMag.dao.EmployeeDaoInterface;
import com.capg.EmpMag.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDaoInterface dao=new EmployeeDao();
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return dao.shoeEmployee();
	}

	public Employee UpdateEmployee(int id) {
		return dao.UpdateEmployee(id);
		
	}

	public boolean removeEmployee(int id) {
		// TODO Auto-generated method stub
		dao.removeEmployee(id);
		return true;
	}

}
