package com.capg.EmpMag.dto;

public class Employee {
private int eid;
private String name;
private double salary;
private Department dept;
public Employee()
{
	
}
public Employee(int eid, String name, double salary, Department dept) {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
	this.dept = dept;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
	return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
}



}
