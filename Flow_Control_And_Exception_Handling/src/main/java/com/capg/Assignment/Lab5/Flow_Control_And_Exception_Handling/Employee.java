package com.capg.Assignment.Lab5.Flow_Control_And_Exception_Handling;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Employee {

	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your salary");
		int salary=scanner.nextInt();
		try
		{
			validateSalary(salary);
		}
		catch(EmployeeException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void validateSalary(int salary) throws EmployeeException{
		// TODO Auto-generated method stub
		if(salary<3000)
		{
			throw new EmployeeException("Invalid salary");
		}
		else
		{
			System.out.println("Valid salary");
		}
	}
}
