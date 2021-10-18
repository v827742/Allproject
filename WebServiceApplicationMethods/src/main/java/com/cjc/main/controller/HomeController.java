package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class HomeController {

	
	@RequestMapping("/")
	public String msg()
	{
		return "String Massege";
	
	}
	
	@RequestMapping(value = "/data",method = RequestMethod.GET)
	public Student m1()
	{
		Student s=new Student();
		s.setRollno(1);
		s.setName("Ashish");
		s.setAddr("pune");
		return s;
	}
	@RequestMapping(value ="/regdata",method = RequestMethod.POST)
	public Student m2(@RequestBody Student s)
	{
		System.out.println("rollno:"+s.getRollno());
		System.out.println("name:"+s.getName());
		System.out.println("Address:"+s.getAddr());
		
		return s;
		
	}
	@GetMapping("/logdata/{uname}/{pass}")
	public String logCheck(@PathVariable("uname") String uname,@PathVariable("pass") String pass)
	{
		System.out.println("UserName:-"+uname);
		System.out.println("PassWord:-"+pass);
		return "welcome"+uname;
	}
}
