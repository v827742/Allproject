package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.HomeServiceI;

@RestController
public class HomeController {

	@Autowired
	HomeServiceI hs;
	
	@PostMapping("/regData")
	public Student RegData(@RequestBody Student s)
	{
		hs.saveData(s);
		
		return s;
		
		
	}
	@GetMapping("/getData")
	public List<Student> getData()
	{
		List<Student> slist=hs.getData();
		
		return slist;
		
		
	}
	@DeleteMapping("/deleteData/{sid}")
	public String deleteData(@PathVariable("sid") int sid)
	{
		hs.deleteRecord(sid);
		return "delete Data";
		
	}
	
}
