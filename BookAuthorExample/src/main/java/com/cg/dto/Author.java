package com.cg.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Author {
	private int authorid;
	private String firstname;
	private String middlename;
	private String lastname;
	private BigInteger phoneno;
	
	public Author()
	{
		
	}
	public Author(int authorid, String firstname, String middlename, String lastname, BigInteger phoneno) {
		super();
		this.authorid = authorid;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.phoneno = phoneno;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public BigInteger getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(BigInteger phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", phoneno=" + phoneno + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authorid;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((middlename == null) ? 0 : middlename.hashCode());
		result = prime * result + ((phoneno == null) ? 0 : phoneno.hashCode());
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
		Author other = (Author) obj;
		if (authorid != other.authorid)
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (middlename == null) {
			if (other.middlename != null)
				return false;
		} else if (!middlename.equals(other.middlename))
			return false;
		if (phoneno == null) {
			if (other.phoneno != null)
				return false;
		} else if (!phoneno.equals(other.phoneno))
			return false;
		return true;
	}
		
	
	
}
