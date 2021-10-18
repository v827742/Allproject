package com.cjc.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.main.model.Student;

@RestController
public class HomeController {

	@Autowired
	RestTemplate restTemp;
	
	@PostMapping("/postData")
	public Student postData(@RequestBody Student s)
	{
		String url="http://localhost:2301/regData";
		
		Student list=restTemp.postForObject(url, s, Student.class);
		return list;
		
	}
}
