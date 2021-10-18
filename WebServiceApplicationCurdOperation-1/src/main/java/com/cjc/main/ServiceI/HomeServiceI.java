package com.cjc.main.ServiceI;

import java.util.List;

import com.cjc.main.model.Employee;

public interface HomeServiceI {

	
	public void saveData(List<Employee> e);
	public List<Employee> login(String uname, String pass);
	
	public List<Employee> editData(int eid);
	
	public void deleteRecord(int eid);
}
