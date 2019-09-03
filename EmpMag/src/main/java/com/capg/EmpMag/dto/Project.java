package com.capg.EmpMag.dto;

import java.util.Arrays;

public class Project {
	private int projectid;
	private String projectname;
	private double projectcost;
	private Employee[] listEmp;
	public Project()
	{
		
	}
	public Project(int projectid, String projectname, double projectcost, Employee[] listEmp) {
		this.projectid = projectid;
		this.projectname = projectname;
		this.projectcost = projectcost;
		this.listEmp = listEmp;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public double getProjectcost() {
		return projectcost;
	}
	public void setProjectcost(double projectcost) {
		this.projectcost = projectcost;
	}
	public Employee[] getListEmp() {
		return listEmp;
	}
	public void setListEmp(Employee[] listEmp) {
		this.listEmp = listEmp;
	}
	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", projectname=" + projectname + ", projectcost=" + projectcost
				+ ", listEmp=" + Arrays.toString(listEmp) + "]";
	}
	
	

}
