package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.HomeServiceI;

@RestController
public class HomeController {

	@Autowired
	HomeServiceI hs;
	
	@PostMapping("/")
	public Student regData(@RequestBody Student s)
	{
		
		Student stu=hs.saveData(s);
		return stu;
		
		
	}
	
	
}
