package com.cjc.main.controller;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	
}
