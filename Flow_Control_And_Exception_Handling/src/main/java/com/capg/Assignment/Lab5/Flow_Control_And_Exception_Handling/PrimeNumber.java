package com.capg.Assignment.Lab5.Flow_Control_And_Exception_Handling;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no upto which u want prime no");
		int n=scanner.nextInt();
		findPrime(n);
		

	}

	public static void findPrime(int n) {
		// TODO Auto-generated method stub
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==1)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}

}
