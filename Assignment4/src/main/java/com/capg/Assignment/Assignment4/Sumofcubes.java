package com.capg.Assignment.Assignment4;

import java.util.Scanner;

public class Sumofcubes {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		String no=sc.next();
		int sum=sumCubes(no);
		System.out.println("Sum of cubes of the digits of the number is "+sum);
	}

	public static int sumCubes(String no) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(no);
		int arr[]=new int[100];
		int i=0;
		while(n>0)
		{
			int r=n%10;
			arr[i++]=r;
			n=n/10;
		}
		int sum=0;
		for(int j=0;j<i;j++)
		{
			sum+=arr[j]*arr[j]*arr[j];
		}
		return sum;
	}

}
