package com.cg.book_stores.ui;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

import com.cg.book_stores.dao.AuthorDao;
import com.cg.book_stores.dao.IAuthorDao;
import com.cg.book_stores.dto.Author;
import com.cg.book_stores.exception.AuthorException;

public class BookClientUi {
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
		System.out.println("3.Update author");
		System.out.println("4.Show author");
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
			break;
		case 3:
	    System.out.println("Enter the author id");
		int authorid=scanner.nextInt();
		System.out.println("Enter the phone no");
		BigInteger phoneno=scanner.nextBigInteger();
		boolean status=authordao.updateAuthor(authorid,phoneno);
		if(status)
		{
			System.out.println("updated");
		}
		break;
		case 4:
			List<Author> authorlist=authordao.listAllAuthors();
			if(authorlist!=null) {
			for(Author author2:authorlist)
			{
				System.out.println(author2);
			}}
			else
			{
				System.out.println("Null ");
			}
			break;
		case 5:
			//Select the list of all book titles which are written by specific Author
			
			break;
		}

	}

}
