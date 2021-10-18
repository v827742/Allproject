package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.serviceI.HomeServiceI;

@RestController
public class HomeController {

	@Autowired
	HomeServiceI hs;
	
	@RequestMapping(value="getData",method = RequestMethod.GET)
	public Employee getData()
	{
		Employee emp=new Employee();
		emp.setEid(1);
		emp.setName("Ashish");
		emp.setAddress("Karvenagar,Pune");
		emp.setMono("7573747879");
		return emp;
		
		
	}
	@PostMapping("/regData")
	public Employee postRegData(@RequestBody Employee em)
	{
		System.out.println("Employee Id :"+em.getEid());
		System.out.println("Employee Name :"+em.getName());
		System.out.println("Employee Address :"+em.getAddress());
		System.out.println("Employee Mono :"+em.getMono());
		
		hs.saveData(em);
		
		return em;
	}
	@RequestMapping(value="getAllData/{uname}/{pass}",method = RequestMethod.GET)
	public List<Employee> getAllData(@PathVariable String uname,@PathVariable String pass)
	{
		
		System.out.println("Username :"+uname);
		System.out.println("PassWord :"+pass);
		List<Employee> elist=hs.logCheck(uname, pass);
		
		return elist;
		
	}
	}
	

