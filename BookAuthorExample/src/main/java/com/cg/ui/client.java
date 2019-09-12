package com.cg.ui;

import java.math.BigInteger;
import java.util.Scanner;

import com.cg.dao.AuthorDao;
import com.cg.dao.IAuthorDao;
import com.cg.dto.Author;
import com.cg.exception.AuthorException;

public class client {
	private static IAuthorDao authordao;
	static
	{
		authordao=new AuthorDao();
	}
	public static void main(String[] args) throws AuthorException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("CRUD Operation");
		System.out.println("1.Add author");
		System.out.println("2.Delete author");
		int choice;
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter firstname");
			String firstname=scanner.next();
			System.out.println("Enter middlename");
			String middlename=scanner.next();
			System.out.println("Enter lastname");
			String lastname=scanner.next();
			System.out.println("Enter phone no");
			BigInteger phone=scanner.nextBigInteger();
		Author author=new Author();
		author.setFirstname(firstname);
		author.setMiddlename(middlename);
		author.setLastname(lastname);
		author.setPhoneno(phone);
		Author a=authordao.addAuthor(author);
		break;
		case 2:
			System.out.println("Enter id");
			int id=scanner.nextInt();
			boolean result=authordao.deleteAuthor(id);
			if(result)
			{
				System.out.println("deleted");
			}
		}

	}

}
