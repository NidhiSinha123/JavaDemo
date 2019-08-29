package com.cg.exception;

public class customExce {
	public static void validate(String name) throws InvalidName
	{
		if(name.length()<8)
		{
			throw new InvalidName("Not valid");
		}
		else
		{
			System.out.println("Valid");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate("nidhi");
		}
		catch(InvalidName e)
		{
			System.out.println(e.getMessage());
		}

	}

}
