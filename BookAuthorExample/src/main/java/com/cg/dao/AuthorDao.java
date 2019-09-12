package com.cg.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.cg.dto.Author;
import com.cg.exception.AuthorException;
import com.cg.exception.MyException;
import com.cg.util.DbUtil;

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
		return null;
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

	public Author updateAuthor(Author author) throws AuthorException {
		// TODO Auto-generated method stub
		return null;
	}

}
