package com.cg.book_stores.dto;

import java.math.BigInteger;

public class Book {
	private BigInteger bookid;
	private String bookname;
	private double bookprice;
	private int authorid;
	public Book()
	{
		
	}

	public Book(BigInteger bookid, String bookname, double bookprice, int authorid) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookprice = bookprice;
		this.authorid = authorid;
	}

	public BigInteger getBookid() {
		return bookid;
	}

	public void setBookid(BigInteger bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public double getBookprice() {
		return bookprice;
	}

	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + ", authorid="
				+ authorid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authorid;
		result = prime * result + ((bookid == null) ? 0 : bookid.hashCode());
		result = prime * result + ((bookname == null) ? 0 : bookname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(bookprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorid != other.authorid)
			return false;
		if (bookid == null) {
			if (other.bookid != null)
				return false;
		} else if (!bookid.equals(other.bookid))
			return false;
		if (bookname == null) {
			if (other.bookname != null)
				return false;
		} else if (!bookname.equals(other.bookname))
			return false;
		if (Double.doubleToLongBits(bookprice) != Double.doubleToLongBits(other.bookprice))
			return false;
		return true;
	}
	
	
	

}
