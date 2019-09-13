package com.cg.book_stores.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.book_stores.dto.Author;
import com.cg.book_stores.dto.Book;
import com.cg.book_stores.exception.AuthorException;
import com.cg.book_stores.exception.MyException;
import com.cg.book_stores.util.DbUtil;

public class AuthorDao implements IAuthorDao {

	//Prep -work 1-Connection
		private static Connection connection;
		private PreparedStatement ps;
		private ResultSet rs;
		private static Logger myLogger;
		static{
		  	
		  	  Properties props = System.getProperties();
		  	  String userDir= props.getProperty("user.dir")+"/src/main/resources/";
		  	  System.out.println("Current working directory is " +userDir);
		  	  PropertyConfigurator.configure(userDir+"log4j.properties");
				myLogger=Logger.getLogger("DBUtil.class");
				}
		static {
			try {
				connection=DbUtil.getConnection();
				myLogger.info("connection obtained.....");
			} catch (MyException e) {
				// TODO Auto-generated catch block
				myLogger.error("connection not established at EmployeeDao: "+e);
			}
		}
		
	public Author addAuthor(Author author) throws AuthorException {
		// TODO Auto-generated method stub
		String sql="insert into author(authorfirstname,authormiddlename,authorlastname,authorphone) values(?,?,?,?)";
		try
		{
			ps=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,author.getFirstname());
			ps.setString(2,author.getMiddlename());
			ps.setString(3,author.getLastname());
			ps.setBigDecimal(4,new BigDecimal(author.getPhoneno()));
			int noOfRecords=ps.executeUpdate();
			if(noOfRecords>0)
			{
				System.out.println("Record inserted successfully");
			}
			
			
		}
		catch(Exception exception)
		{
			myLogger.error("Error at addEmployee Dao method: "+exception.getMessage());
		}
		finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					myLogger.error("Error at addEmployee Dao method:"+e.getMessage());
				}
			}
		}
		return author;
	}

	public List<Author> listAllAuthors() throws AuthorException {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------listAllAuthors Dao----------------------------------");
		String sql="select * from author a inner join book b on a.authorid=b.authorid";
		List<Author> authorlist=new ArrayList<Author>();
		List<Book> booklist=new ArrayList<Book>();
		Author author=null;Book book=null;
		try
		{
			ps=connection.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println("********Inside dao while");
				author=new Author();
				System.out.println("********rs.getInt(\"authorid\") : "+rs.getInt(1));
				author.setAuthorid(rs.getInt(1));
				author.setFirstname(rs.getString(2));
				author.setMiddlename(rs.getString(3));
				author.setLastname(rs.getString(4));
				author.setPhoneno(BigInteger.valueOf(rs.getLong(5)));
				book=new Book();
				System.out.println("********rs.getLong(\"bookid\") "+rs.getLong("bookid"));
				book.setBookid(BigInteger.valueOf(rs.getLong(6)));
				book.setBookname(rs.getString(7));
				book.setBookprice(rs.getDouble(8));
				book.setAuthorid(rs.getInt(9));
				System.out.println("********book: "+book);
				booklist.add(book);
				author.setListofbooks(booklist);

				System.out.println("********Author: "+author);
				authorlist.add(author);
			}
			
			System.out.println("********AuthorList: "+authorlist);
		}
		catch(Exception exception)
		{
			myLogger.error("Error at addEmployee Dao method: "+exception.getMessage());
		}
		finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					myLogger.error("Error at addEmployee Dao method:"+e.getMessage());
				}
			}
		}
		
		
		return authorlist;
	}

	public boolean deleteAuthor(int authorid) throws AuthorException {
		// TODO Auto-generated method stub
		String sql="delete from author where authorid=?";
		try
		{
			ps=connection.prepareStatement(sql);
			ps.setInt(1,authorid);
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("deleted successfully");
			}
		}
		catch(Exception exception)
		{
			myLogger.error("Error at addEmployee Dao method: "+exception.getMessage());
		}
		finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					myLogger.error("Error at addEmployee Dao method:"+e.getMessage());
				}
			}
		}
		return true;
	}

	public boolean updateAuthor(int authorid,BigInteger phoneno) throws AuthorException {
		// TODO Auto-generated method stub
		String sql="Update author SET authorphone=? where authorid=?";
		try
		{
			ps=connection.prepareStatement(sql);
			
		    ps.setBigDecimal(1, new BigDecimal(phoneno));
		    ps.setInt(2, authorid);
		    
		    int i=ps.executeUpdate();
		    if(i>0)
		    {
		    	System.out.println("Updated successfully");
		    }
		    else
		    {
		    	System.out.println("Not updated");
		    }
		}
		catch(Exception exception)
		{
			myLogger.error("Error at addEmployee Dao method: "+exception.getMessage());
		}
		finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					myLogger.error("Error at addEmployee Dao method:"+e.getMessage());
				}
			}
		}
		
		return true;
	}

	
}
