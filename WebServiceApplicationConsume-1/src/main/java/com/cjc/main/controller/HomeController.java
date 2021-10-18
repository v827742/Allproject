package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.main.model.Employee;
@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	RestTemplate restTemp;
	
	@GetMapping("getAllData")
	public Employee getAlldata()
	{
		String url="http://localhost:4040/getData";
		Employee emp=restTemp.getForObject(url, Employee.class);
		return emp;
		
	}
	
	@GetMapping("getData/{uname}/{pass}")
	public List getUIdata(@PathVariable String uname,@PathVariable String pass)
	{
		System.out.println("userName :"+uname);
		
		System.out.println("Password :"+pass);
		
		String url="http://localhost:4040/getAllData"+"/"+uname+"/"+pass;
		List emp=restTemp.getForObject(url, List.class);
		return emp;
		
	}
	
	@RequestMapping(value="/postData",method = RequestMethod.POST )
	public Employee saveData(@RequestBody Employee em)
	{
		
		
		String url="http://localhost:4040/regData";
		Employee emp=restTemp.postForObject(url, em, Employee.class);
		return emp;
		
	}
	
}
