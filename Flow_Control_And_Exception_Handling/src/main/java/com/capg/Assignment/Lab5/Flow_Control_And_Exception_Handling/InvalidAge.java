package com.capg.Assignment.Lab5.Flow_Control_And_Exception_Handling;

import java.util.Scanner;

public class InvalidAge {

	public static void validateAge(int age) throws InvalidAgeException
	{
		if(age<15)
		throw new InvalidAgeException("Invalid age");
		else
			System.out.println("Valid age");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter age ");
		int age=scanner.nextInt();
		try
		{
			 validateAge(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
