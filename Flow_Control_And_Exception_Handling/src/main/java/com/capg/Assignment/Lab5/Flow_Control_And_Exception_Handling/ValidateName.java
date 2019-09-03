package com.capg.Assignment.Lab5.Flow_Control_And_Exception_Handling;

import java.util.Scanner;

public class ValidateName {
	public static void validate(String firstname,String secondname) throws InvalidName
	{
		if(firstname.length()==0 && secondname.length() == 0 )
		{
			throw new InvalidName("Invalid name.Please enter your firstname and lastname");
		}
		else if(firstname.length()==0)
		{
			throw new InvalidName("Invalid name.Please enter your firstname");
		}
		else if(secondname.length()==0)
		{
			throw new InvalidName("Invalid name.Please enter your last name");
		}
		else
		{
			System.out.println("Valid name");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your firstname");
		String firstname=sc.nextLine();
		System.out.println("Enter your secondname");
		String secondname=sc.nextLine();
		try
		{
			validate(firstname,secondname);
		}
		catch(InvalidName e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
