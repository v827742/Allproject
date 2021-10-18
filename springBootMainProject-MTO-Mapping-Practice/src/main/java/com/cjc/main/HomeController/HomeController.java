package com.cjc.main.HomeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.main.HomeServiceImpl.HomeServiceImpl;
import com.cjc.main.Model.Department;
import com.cjc.main.Model.Employee;

@RestController
public class HomeController {

	@Autowired
    HomeServiceImpl hsi;
	
	@PostMapping("/addempdata")
   public String addAllData(@RequestBody List<Employee> emp)
   {
		hsi.addEmpDept(emp);
	return "Add Data SuccesFullly Into the Data Base";
	   
   }
	
	@PostMapping("/addEmployee/{dname}")
	public String employeeData(@RequestBody Employee employee,@PathVariable("dname")String dname)
	{
		System.out.println("Department :" +employee+"   "+dname);
	      hsi.addEmployeeWithDepartment(employee,dname);
		return "Department inserted";
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Employee> deleteById(@PathVariable("id") int id){
	return	hsi.deletePerticularEmployee(id);
	}
	
	@DeleteMapping("/allDataDelete")
	public List<Employee> deleteAllData(){
		return hsi.deleteAllData();
	}
	
	@PostMapping("/addDeprt")
	public String m1(@RequestBody Department department)
	{
		System.out.println("Department :" +department);
	      hsi.addDepartment(department);
		return "Department inserted";
	}
	
	@GetMapping("/getallEmployee/{dname}")
	public List<Employee> m3(@PathVariable("dname")String dname){
		return hsi.getAllEmployeeUnderPerticularDeprtment(dname);
	}

}
