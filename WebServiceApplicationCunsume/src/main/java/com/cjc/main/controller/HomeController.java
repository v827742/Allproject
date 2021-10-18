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

import com.cjc.main.model.Student;


@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	RestTemplate restTemp;
	@GetMapping("getData")
	public List getAllData()
	{
		
		
	String	url="http://localhost:2323/getAllData";
		List list=restTemp.getForObject(url, List.class);
		
		return list;
		
	}
	@RequestMapping(value="/regData",method = RequestMethod.POST)
	public List postData(@RequestBody Student s)
	{
		String url="http://localhost:2323/regAllData";
		List list=restTemp.postForObject(url, s, List.class);
		
		return list;
		
	}
	
	
	@RequestMapping(value="getAllData/{un}/{ps}",method = RequestMethod.GET)
	public List getAllData(@PathVariable("un")String uname,@PathVariable("ps")String pass)
	{
		System.out.println("Username :"+uname);
		System.out.println("Password :"+pass);
	String	url="http://localhost:3032/getAllData";
		List list=restTemp.getForObject(url, List.class);
		
		return list;
		
	}
	
}
