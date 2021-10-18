package com.cjc.main.HomeServiceI;

import java.util.List;

import com.cjc.main.Model.Department;
import com.cjc.main.Model.Employee;

public interface HomeServiceI {
	
	void addEmpDept(List<Employee> emp);

	void addDepartment(Department department);

	void addEmployeeWithDepartment(Employee employee,String dname);
	
	List<Employee> deletePerticularEmployee(int id);
	
	List<Employee> deleteAllData();
	
	List<Employee> getAllEmployeeUnderPerticularDeprtment(String name);


}
