package com.cg.demojpa.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.cg.demojpa.dto.Employee;

public class EmpDaoImpl implements  EmpDao {

	EntityManagerFactory entityFactory=Persistence.createEntityManagerFactory("demojpa");
			
			
	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		EntityManager em=entityFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		em.persist(emp);
		tran.commit();
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		EntityManager em=entityFactory.createEntityManager();
		Query query=em.createQuery("FROM Employee");
		List<Employee> empList=query.getResultList();
		return empList;
	}

	@Override
	public void remove(Integer empId) {
		// TODO Auto-generated method stub
		EntityManager em=entityFactory.createEntityManager();
		Employee empRemove=em.find(Employee.class,empId);
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		em.remove(empRemove);
		tran.commit();
		
		
	}

	@Override
	public void updateSalary(Integer empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findBetweenSalary(double min, double max) {
		// TODO Auto-generated method stub
		EntityManager em=entityFactory.createEntityManager();
		Query query=em.createQuery("FROM Employee WHERE empSalary BETWEEN :first AND :second");
		query.setParameter("first",min);
		query.setParameter("second",max);
		List<Employee> empList=query.getResultList();
		return empList;
	}

}
