package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.main.model.Student;
@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	RestTemplate rete;
	
	@RequestMapping("/getData/{uname}/{pass}")
	public List Login(@PathVariable String uname,@PathVariable String pass)
	{
		System.out.println("Uname :"+uname);
		System.out.println("Pass :"+pass);
		String url="http://localhost:5054/getProData";
		
		List list=rete.getForObject(url, List.class);
		return list;
		
	}
	@PostMapping("/postData")
	public List regData(@RequestBody Student s) {
		
		System.out.println("Rollno :"+s.getRollno());
		System.out.println("Name :"+s.getName());
		System.out.println("Addr :"+s.getAddr());
		
		String url="http://aashish:5054/postAllData";
		List list=rete.postForObject(url, s, List.class);
		return list;
	}
	
}
