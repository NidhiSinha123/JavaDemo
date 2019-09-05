package com.capg.Assignment.Lab8.StringsIoParsing;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StingTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter numbers");
		String string=scanner.nextLine();
		int sum=0;
		StringTokenizer st2 = new StringTokenizer(string); 
		while(st2.hasMoreTokens())
		{
			int r=Integer.parseInt(st2.nextToken());
			System.out.println(r);
			sum+=r;
		}
		System.out.println("Sum of numbers is "+sum);
		

	}

}
