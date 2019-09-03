package com.cg.Employee.Management.dao;

import com.cg.Employee.Management.dto.Employee;
import com.cg.Employee.Management.service.EmployeeServiceImpl;

public class EmployeeDaoImpl implements EmployeeDao{

	 Employee em[]=new Employee[5];
	 Employee e=new Employee();
	 static int counter;
	 EmployeeServiceImpl ep=new EmployeeServiceImpl();
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if(counter>=5)
		{
			return false;
		}
		this.em[counter++]=emp;
		return true;
		
	}

	public Employee updateEmployee(int id) {
		// TODO Auto-generated method stub
		return ep.updateEmployee(id);
	}

	public Employee removeEmployee(int id) {
		// TODO Auto-generated method stub
		return ep.removeEmployee(id);
	}

	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return ep.searchEmployee(id);
	}

	public Employee[] showEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return ep.showEmployee(e);
	}

}
