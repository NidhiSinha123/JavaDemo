package com.cg.Employee.Management.dto;

import java.util.Arrays;

public class Project {
	private int pid;
	private String pname;
	private double pcost;
	private Employee[] emp;
	
	public Project()
	{
		
	}

	public Project(int pid, String pname, double pcost, Employee[] emp) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
		this.emp = emp;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPcost() {
		return pcost;
	}

	public void setPcost(double pcost) {
		this.pcost = pcost;
	}

	public Employee[] getEmp() {
		return emp;
	}

	public void setEmp(Employee[] emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + ", emp=" + Arrays.toString(emp) + "]";
	}
	

}
