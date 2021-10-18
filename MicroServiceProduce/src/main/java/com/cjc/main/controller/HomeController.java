package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class HomeController {

	@RequestMapping("/getProData")
	public List preLog()
	{
		Student s=new Student();
		s.setRollno(1);
		s.setName("Ashish");
		s.setAddr("Chandrapur");
		
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("neel");
		s1.setAddr("Pune");
		
		List sl=new ArrayList();
		sl.add(s);
		sl.add(s1);
		return sl;
		
		
	}
	
	@PostMapping("/postAllData")
	public List regData(@RequestBody Student s) {
		
		System.out.println("Rollno :"+s.getRollno());
		System.out.println("Name :"+s.getName());
		System.out.println("Addr :"+s.getAddr());
		List list=new ArrayList();
		list.add(s);
		return list;
	}
	
}
