package com.capg.EmpMag.ui;

import java.util.Scanner;

import com.capg.EmpMag.dto.Department;
import com.capg.EmpMag.dto.Employee;
import com.capg.EmpMag.service.EmployeeService;
import com.capg.EmpMag.service.EmployeeServiceImpl;

public class MyApplication {
	public static void main(String args[])
	{
		EmployeeService service=new EmployeeServiceImpl();
		Employee em=new Employee();
		Scanner sc =new Scanner(System.in);
		int flag=0;
		while(flag==0)
		{
		System.out.println("-----Menu-------");
		System.out.println("1.Add employee");
		System.out.println("2.Remove employee");
		System.out.println("3.Update employee");
		System.out.println("4.Show Employee");
		System.out.println("5.Search Employee");
		System.out.println("6.Add project");
		System.out.println("7.Remove project");
		System.out.println("8.Update project");
		System.out.println("9.Show projects");
		System.out.println("10.Show EmployeeList");
		System.out.println("Enter your choice");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			int j=0;
			while(j<2){
				Employee emp=new Employee();
			System.out.println("Enter Employee Id");
			int id=sc.nextInt();
			
			System.out.println("Enter Employee name");
			String name=sc.next();
			
			System.out.println("Enter Employee salary");
			double sal=sc.nextDouble();
			
			System.out.println("Enter Department Id");
			int did=sc.nextInt();
			
			System.out.println("Enter Department name");
			String dname=sc.next();
			
			
			Department dep=new Department();
			dep.setDeptid(did);
			dep.setDeptName(dname);
			
			
			emp.setEid(id);
			emp.setName(name);
			emp.setSalary(sal);
			emp.setDept(dep);
			service.addEmployee(emp);
			j++;
			System.out.println("Do u want to add more employee.Enter 1 to continue and 0 to exit");
			int n=sc.nextInt();
			if(n==0)
				break;
			}
			Employee empArr[]=service.showEmployee();
			for(Employee emp1:empArr)
			{
				System.out.println(emp1);
			}
			break;
		case 2:
			System.out.println("Enter the empid of the employee which u want to remove");
			int id=sc.nextInt();
			boolean result=service.removeEmployee(id);
			if(result)
			{
				
				System.out.println("removed");
			}
			else
			{
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("Enter empid to update");
			int empid=sc.nextInt();
			Employee empUpdate=service.UpdateEmployee(empid);

		    System.out.println("Updated ");
		    break;
		case 4:
			Employee emp3[]=service.showEmployee();
			for(Employee e:emp3)
			{
				System.out.println(e);
			}
			break;
			
			

		}
		System.out.println("If you want to quit press 1");
		flag=sc.nextInt();
		}
		
		/*for(int i=0;i<empArr.length;i++)
		{
		
			System.out.println(empArr);
		}*/
		
	}

}
