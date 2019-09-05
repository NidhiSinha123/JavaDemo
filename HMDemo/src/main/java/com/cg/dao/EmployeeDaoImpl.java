package com.cg.dao;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	Map<Integer,Employee<Integer,Double>> hmap=new HashMap<Integer,Employee<Integer,Double>>();
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		hmap.put((Integer)emp.getEmpid(), emp);
		return emp;
	}

	public HashMap<Integer, Employee<Integer,Double>> showEmployee() {
		// TODO Auto-generated method stub
		return (HashMap<Integer, Employee<Integer, Double>>) this.hmap;
	}

	public boolean removeEmployee(int  empid) {
		// TODO Auto-generated method stub
		int flag=0;
		for (Map.Entry<Integer,Employee<Integer,Double>> en : hmap.entrySet()) { 
			if(en.getKey()==empid)
			{
				hmap.remove(en.getKey());
				flag++;
				break;
			}
		} 
		if(flag==0)
			return false;
		else
		return true;
	}

	public HashMap<Integer, Employee<Integer,Double>> sortEmployee() {
		// TODO Auto-generated method stub
		hmap=sortMethod(hmap);
		return (HashMap<Integer, Employee<Integer, Double>>) hmap;
	}

	public Map<Integer, Employee<Integer, Double>> sortMethod(Map<Integer, Employee<Integer, Double>> hmap2) {
		List<Map.Entry<Integer,Employee<Integer,Double>> > list = 
	               new LinkedList<Map.Entry<Integer,Employee<Integer,Double>> >(hmap2.entrySet()); 
	  
	        // Sort the list 
	        Collections.sort(list, new Comparator<Map.Entry<Integer,Employee<Integer,Double>> >() { 
	           
				public int compare(Entry<Integer, Employee<Integer, Double>> o1,
						Entry<Integer, Employee<Integer, Double>> o2) {
					// TODO Auto-generated method stub
					return (int) ((o1.getValue().getSalary())-(o2.getValue().getSalary()));
					
				} 
	        }); 
	          
	        // put data from sorted list to hashmap  
	        HashMap<Integer,Employee<Integer,Double>> temp = new LinkedHashMap<Integer,Employee<Integer,Double>>(); 
	        for (Map.Entry<Integer,Employee<Integer,Double>> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        return temp; 
	}

	public Employee searchEmployee(int  empid) {
		// TODO Auto-generated method stub
		for(Map.Entry mapElement : hmap.entrySet())
		{
			if((Integer)mapElement.getKey()==empid)
			{
				return (Employee) mapElement;
			}
		}
			
		return null;
	}

}
