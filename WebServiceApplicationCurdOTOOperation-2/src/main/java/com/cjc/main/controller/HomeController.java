package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.HomeServiceI;

@RestController
public class HomeController {
    @Autowired
	HomeServiceI hs;
	
    @GetMapping("/")
	public Student firstData()
	{
    	Student s=new Student();
    	s.setUname("ash123");
    	s.setPass("123456");
    	s.setName("Ashish");
    	s.setDOB("26/08/96");
    	s.setEmail("ash@Gmail.com");
    	s.setMono("8579659896");
    	s.setGender("male");
    	
		return s;
		
	}
    @PostMapping("/regdata")
    public Student regData(@RequestBody Student s)
    {
    	
    	System.out.println("Uname:"+s.getUname());
    	hs.saveData(s);
		return s;
    	
    }
    @GetMapping("/logdata/{uname}/{pass}")
    public List<Student> logCheck(@PathVariable("uname")String uname,@PathVariable("pass")String pass)
    {
    	
    	System.out.println("uname:-"+uname);
    	System.out.println("uname:-"+pass);
    List<Student> slist=hs.findalldata(uname, pass);
    	
		return slist;
    	
    }
    @GetMapping("/edit/{rollno}")
    public Student editData(@PathVariable("rollno") int rollno)
    {
    	Student s=hs.editData(rollno);
		return s;
    	
    }
    @PutMapping("/update")
    public Student updateData(@RequestBody Student s)
    {
    	hs.saveData(s);
		return s;
    	
    }
    
    @DeleteMapping("/delt/{rollno}")
    public String deleteData(@PathVariable("rollno") int rollno)
    {
    	 hs.deleteData(rollno);
    	
		return "delete"; 
    	
    }
   
   
    
}
