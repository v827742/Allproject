package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Employee;


public interface HomeServiceI {

	
	public void saveData(Employee s);
	
	public Employee logCheck(String uname,String Pass);
	

	public Iterable<Employee> getAllData();
	
	public Iterable<Employee> getOneData(String uname,String pass);
	
	public Employee editData(int empid);
	
	public void deleteData(int empid);
	
}
