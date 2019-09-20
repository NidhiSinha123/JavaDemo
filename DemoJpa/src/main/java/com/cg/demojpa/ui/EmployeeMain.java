package com.cg.demojpa.ui;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.cg.demojpa.dto.Address;
import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;
import com.cg.demojpa.exception.UserDefinedException;
import com.cg.demojpa.service.EmployeeService;
import com.cg.demojpa.service.EmployeeServiceImpl;



public class EmployeeMain {

	public static void main(String[] args) throws UserDefinedException, ParseException {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		Scanner scanner = new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("Enter Id");
		int id=scanner.nextInt();
		System.out.println("Enter name");
		String name=scanner.next();
		System.out.println("Enter salary");
		double sal=scanner.nextDouble();
		System.out.println("Enter date");
		String date=scanner.next();
		SimpleDateFormat st=new SimpleDateFormat("yyyy/MM/dd");
		Date dateNew=st.parse(date);
		System.out.println("Enter your city");
		String city=scanner.next();
		System.out.println("Enter your state");
		String state=scanner.next();
		System.out.println("Enter your pincode");
		int pincode=scanner.nextInt();
		Address addr=new Address();
		Project pro=new Project();
		System.out.println("Enter project id");
		int pid=scanner.nextInt();
		System.out.println("Enter project name");
		String pname=scanner.next();
		System.out.println("Enter project cost");
		Double pcost=scanner.nextDouble();
		addr.setCity(city);
		addr.setState(state);
		addr.setPincode(pincode);
		pro.setProjId(pid);
		pro.setProjName(pname);
		pro.setProjCost(pcost);
		
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSalary(sal);
		emp.setDateOfJoining(dateNew);
		emp.setAddr(addr);
		emp.setProj(pro);
		service.save(emp);
		
		/*System.out.println("Enter id which you want to remove");
		int id=scanner.nextInt();
		service.remove(id); 
		
		java.util.List<Employee> empList=service.findAll();
		for(Employee e:empList)
		{
			System.out.println(e);
		}*/
		/*System.out.println("Enter max");
		int max=scanner.nextInt();
		System.out.println("Enter min");
		int min=scanner.nextInt();
		List<Employee> listEmployee=service.findBetweenSalary(min, max);
		for(Employee e:listEmployee)
		{
			System.out.println(e);
		}*/
		
	

	}

}
