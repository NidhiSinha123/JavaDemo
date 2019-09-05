package com.capg.Assignment.Lab8.StringsIoParsing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {
	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename=scanner.next();
		File file=new File(filename);
		Scanner scanner1=new Scanner(file);
		int count=1;
		while(scanner1.hasNextLine())
		{
			System.out.println(count+"."+scanner1.nextLine());
			count++;
		}
		
		
	}

}
