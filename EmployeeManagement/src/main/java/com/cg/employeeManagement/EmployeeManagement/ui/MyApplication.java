package com.cg.employeeManagement.EmployeeManagement.ui;

import java.util.Scanner;

import com.cg.employeeManagement.EmployeeManagement.Department;
import com.cg.employeeManagement.EmployeeManagement.Employee;
import com.cg.employeeManagement.EmployeeManagement.Service.EmployeeService;
import com.cg.employeeManagement.EmployeeManagement.Service.EmployeeServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		Employee em=new Employee();
		Scanner sc =new Scanner(System.in);
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
		dep.setDeptId(did);
		dep.setDeptName(dname);
		
		
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSalary(sal);
		emp.setEmpDepartment(dep);
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
		System.out.println("Enter empid"
				+ " to update");
		int empid=sc.nextInt();
		Employee empUpdate=service.UpdateEmployee(empid);

	    System.out.println("Updated "+empUpdate);
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
		Employee emp3[]=service.showEmployee();
		for(Employee e:emp3)
		{
			System.out.println(e);
		}
		/*for(int i=0;i<empArr.length;i++)
		{
		
			System.out.println(empArr);
		}*/

	}

}
