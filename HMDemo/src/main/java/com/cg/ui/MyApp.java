package com.cg.ui;

import java.util.Map;
import java.util.Scanner;

import com.cg.dto.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImpl;


public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		//Employee emp=new Employee();
		Scanner sc =new Scanner(System.in);
		int flag=0;
		while(flag==0)
		{
		System.out.println("-----Menu-------");
		System.out.println("1.Add Employee");
		System.out.println("2.Show Employee");
		System.out.println("3.Remove employee");
		System.out.println("4.Sort Employee");
		System.out.println("5.Search Employee");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			
			System.out.println("Enter Employee Id");
			int id=sc.nextInt();
			
			System.out.println("Enter Employee name");
			String name=sc.next();
			
			System.out.println("Enter Employee salary");
			double sal=sc.nextDouble();
			Employee emp=new Employee();
			
			emp.setEmpid(id);
			emp.setEmpname(name);
			emp.setSalary(sal);
			service.addEmployee(emp);
			break;
		case 2:
			
			Map<Integer,Employee<Integer,Double>> hmap = service.showEmployee();
			for (Map.Entry<Integer,Employee<Integer,Double>> en : hmap.entrySet()) { 
				System.out.println("Key = " + en.getKey() + 
							", Value = " + en.getValue()); 
			} 
			break;
		case 3:
			System.out.println("Enter the empid of the employee which u want to remove");
			int id1=sc.nextInt();
			boolean result=service.removeEmployee(id1);
			if(result)
			{
				
				System.out.println("removed");
			}
			else
			{
				System.out.println("not found");
			}
			break;
		case 4:
			Map<Integer,Employee<Integer,Double>> hmap1 = service.sortEmployee();
			for (Map.Entry<Integer,Employee<Integer,Double>> en : hmap1.entrySet()) { 
				System.out.println("Key = " + en.getKey() + 
							", Value = " + en.getValue()); 
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

