package com.cg.demojpa.ui;

import java.util.Scanner;
import java.util.List;
import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.exception.UserDefinedException;
import com.cg.demojpa.service.EmployeeService;
import com.cg.demojpa.service.EmployeeServiceImpl;



public class EmployeeMain {

	public static void main(String[] args) throws UserDefinedException {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		Scanner scanner = new Scanner(System.in);
		Employee emp=new Employee();
		/*System.out.println("Enter Id");
		int id=scanner.nextInt();
		System.out.println("Enter name");
		String name=scanner.next();
		System.out.println("Enter salary");
		double sal=scanner.nextDouble();
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSalary(sal);
		service.save(emp);*/
		
		/*System.out.println("Enter id which you want to remove");
		int id=scanner.nextInt();
		service.remove(id); 
		
		java.util.List<Employee> empList=service.findAll();
		for(Employee e:empList)
		{
			System.out.println(e);
		}*/
		System.out.println("Enter max");
		int max=scanner.nextInt();
		System.out.println("Enter min");
		int min=scanner.nextInt();
		List<Employee> listEmployee=service.findBetweenSalary(min, max);
		for(Employee e:listEmployee)
		{
			System.out.println(e);
		}
	

	}

}
