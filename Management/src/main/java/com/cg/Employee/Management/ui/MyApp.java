package com.cg.Employee.Management.ui;

import java.util.Scanner;

import com.cg.Employee.Management.dao.EmployeeDaoImpl;
import com.cg.Employee.Management.dto.Department;
import com.cg.Employee.Management.dto.Employee;
import com.cg.Employee.Management.service.EmployeeService;
import com.cg.Employee.Management.service.EmployeeServiceImpl;

public class MyApp {
public static void main(String args[])
{
	EmployeeService emp=new EmployeeServiceImpl();
	Department dept=new Department();
	Employee e=new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("--------MENU--------");
	System.out.println("1.Add Employee");
	System.out.println("2.Delete Employee");
	System.out.println("3.Update Employee");
	System.out.println("4.Search Employee");
	System.out.println("5.Show Employee");
	System.out.println("Enter your choice");
	/*int choice=sc.nextInt();
	int j=0;
	
			System.out.println("Enter empid");
			int id=sc.nextInt();
			e.setEmpid(id);
			System.out.println("Enter empname");
			String name=sc.next();
			e.setEmpname(name);
			System.out.println("Enter salary");
			int sal=sc.nextInt();
			e.setSalary(sal);
			System.out.println("Enter department id ");
			int did=sc.nextInt();
			dept.setDeptid(did);
			System.out.println("Ënter department name");
			String dname=sc.next();
			dept.setDeptname(name);
			e.setDept(dept);
			emp.addEmployee(e);*/
		
}
}
