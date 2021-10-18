package com.cjc.main.HomeServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.HomeRepasitory.DepartmentRepository;
import com.cjc.main.HomeRepasitory.EmployeeRepository;
import com.cjc.main.HomeServiceI.HomeServiceI;
import com.cjc.main.Model.Department;
import com.cjc.main.Model.Employee;

@Service
public class HomeServiceImpl implements HomeServiceI{
     @Autowired
    EmployeeRepository er;
     @Autowired
     DepartmentRepository dr;
	@Override
	public void addEmpDept(List<Employee> emp) {
		
		er.saveAll(emp);
		
	}

	@Override
	public void addDepartment(Department department) {
		
		dr.save(department);
		
	}

	@Override
	public void addEmployeeWithDepartment(Employee employee, String dname) {
		
		Department department  =dr.findByDname(dname);
		  employee.setDepartment(department);
		  er.save(employee);
		
		
		
	}

	@Override
	public List<Employee> deletePerticularEmployee(int id) {
		 Employee e=er.findById(id).get(); 
		   System.out.println(e);
		   er.delete(e);
		return  er.findAll();
	
	}

	@Override
	public List<Employee> deleteAllData() {
		List<Employee>elist= er.findAll();
		  er.deleteAll(elist);
			return elist;
		
	}

	@Override
	public List<Employee> getAllEmployeeUnderPerticularDeprtment(String name) {
		 Department d=dr.findByDname(name);
		 List<Employee>  elist=er.findByDepartment_Id(d.getId());
		return elist;
	}


	


}
