package com.cg.Employee.Management.dto;

public class Employee {
	private int empid;
	private String empname;
	private double salary;
	private Department dept;
	
	public Employee()
	{
		
	}

	public Employee(int empid, String empname, double salary, Department dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	

}
