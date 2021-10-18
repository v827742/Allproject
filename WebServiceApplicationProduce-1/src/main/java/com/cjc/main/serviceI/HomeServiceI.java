package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Employee;

public interface HomeServiceI{

	public void saveData(Employee em);
	
	public List<Employee> logCheck(String uname ,String pass);
}
