package com.cg.employeeManagement.EmployeeManagement.dao;

import com.cg.employeeManagement.EmployeeManagement.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	Employee emp[]=new Employee[2];
	static private int i=0;
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		this.emp[i]=emp;
		i++;
		
		return emp;
	}

	public Employee[] shoeEmployee() {
		// TODO Auto-generated method stub
		return this.emp;
	}

	public Employee UpdateEmployee(int empid) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
	    for(int i=0;i<emp.length;i++)
	    {
		if(emp[i].getEmpId()==empid) {
		emp[i].setEmpName(emp[i].getEmpName().concat("cg"));
		emp[i].setEmpSalary(emp[i].getEmpSalary()+100);
		e1=emp[i];
		//emp.setEmpDepartment();
	    }}
		return e1;
		
		
	}

	public boolean removeEmployee(int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].getEmpId()==id)
			{
				emp[i]=null;
				return true;
			}
		}
	
		return false;
	}

	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
