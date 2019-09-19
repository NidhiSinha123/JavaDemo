package com.cg.demojpa.service;

import java.util.List;

import com.cg.demojpa.dao.EmpDao;
import com.cg.demojpa.dao.EmpDaoImpl;
import com.cg.demojpa.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmpDao dao=new EmpDaoImpl();
	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		return dao.save(emp);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void remove(Integer empId) {
		// TODO Auto-generated method stub
		dao.remove(empId);
		
	}

	@Override
	public void updateSalary(Integer empId) {
		// TODO Auto-generated method stub
		dao.updateSalary(empId);
		
	}

	@Override
	public List<Employee> findBetweenSalary(double min, double max) {
		// TODO Auto-generated method stub
		return dao.findBetweenSalary(min, max);
	}
	

}
