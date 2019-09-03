package com.capg.Assignment.Lab5.Flow_Control_And_Exception_Handling;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=scanner.nextInt();
		int nthValue=nfibonacci(n);
		System.out.println("n th value of the fibonacci series "+nthValue);
		
		int nthValue1=rfibonacci(n);
		System.out.println("n th value of the fibonacci series "+nthValue1);

	}
	public static int rfibonacci(int n) {
		// TODO Auto-generated method stub
		if(n<=1)
			return n;
		else
			return rfibonacci(n-1)+rfibonacci(n-2);
		
	}
	//non recursive
	public static int nfibonacci(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		else if(n==2)
			return 1;
		else
		{
			int a=1;
			int b=1;
			
			for(int i=3;i<=n;i++)
			{
				int temp=a+b;
				a=b;
				b=temp;
				
				
			}
			return b;
		}
		
		
	}//1 1 2 3 5 8 13 21

}
