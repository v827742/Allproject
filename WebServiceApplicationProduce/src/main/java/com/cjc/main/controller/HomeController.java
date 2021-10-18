package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class HomeController {

	
	@GetMapping("/getAllData")
	public List getAllData()
	{
		
		Student stu=new Student();
		stu.setRollno(1);
		stu.setName("Ashish");
		stu.setAddr("pune");
		
		List list=new ArrayList();
		list.add(stu);
		return list;
	}
	@PostMapping("/regAllData")
	public List regData(@RequestBody Student s)
	{
		System.out.println("Roll No: "+s.getRollno());
		System.out.println("Name: "+s.getName());
		System.out.println("Address: "+s.getAddr());
		List list=new ArrayList();
		list.add(s);
		return list;
		
	}
	
	
	
}
