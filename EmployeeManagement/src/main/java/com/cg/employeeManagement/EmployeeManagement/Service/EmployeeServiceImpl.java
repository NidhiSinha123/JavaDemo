package com.cg.employeeManagement.EmployeeManagement.Service;

import com.cg.employeeManagement.EmployeeManagement.Employee;
import com.cg.employeeManagement.EmployeeManagement.dao.EmployeeDao;
import com.cg.employeeManagement.EmployeeManagement.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao=new EmployeeDaoImpl();
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
