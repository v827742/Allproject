package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.HomeServiceI;

@RestController
public class HomeController {

	@Autowired
	HomeServiceI hs;
	
	@GetMapping("/")
	public List<Student> loginCheck()
	{
		
		List<Student> slist=hs.logData();
		return slist;
		
	}
	@PutMapping("/updateData")
	public List<Student> updateData(@RequestBody List<Student> s)
	{
		
		List<Student> slist=hs.update(s);
		return slist;
		
	}
}
