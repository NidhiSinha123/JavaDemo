package com.capg.Assignment.Lab8.StringsIoParsing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename=scanner.next();
		File file=new File(filename);
		Scanner scanner1=new Scanner(file);
		
		int wordcount=0;
		int linecount=0;
		int charactercount=0;
		
		while(scanner1.hasNextLine())
		{
			linecount++;
			String line = scanner1.nextLine();
			//String line=scanner.nextLine();
			StringTokenizer st=new StringTokenizer(line," ");
			while(st.hasMoreTokens())
			{
				String word=st.nextToken();
				int n=word.length();
				wordcount++;
				charactercount+=n;
			}
		}
		System.out.println("No of lines "+linecount);
		System.out.println("No of words "+wordcount);
		System.out.println("No of characters "+charactercount);

	}

}
