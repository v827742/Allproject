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

import com.cjc.main.model.Address;
import com.cjc.main.model.Student;
import com.cjc.main.serviceI.HomeServiceI;

@RestController
public class HomeController {
    @Autowired
	HomeServiceI hs;
    
    @RequestMapping(value="/reg",method = RequestMethod.POST)
    public String saveStu(@RequestBody Student stu)
    {
    	hs.saveData(stu);
    	
		return "Save Data Successfull";
    	
    }
    
    
    @RequestMapping(value="/regListData",method = RequestMethod.POST)
    public List<Student> saveStuAll(@RequestBody List<Student> stu)
    {
    	List<Student> stulist=hs.savelistData(stu);
    	
		return stulist;
    	
    }
    
    @GetMapping("/getdata")
    public List<Student> getData()
    {
		List<Student> slist=hs.getAllData();
    	return slist;
    	
    }
    @GetMapping("/editdata/{stuid}")
    public Student editData(@PathVariable("stuid") int stuid)
    {
    	Student stu=hs.editData(stuid);
		return stu;
    	
    }
    @PutMapping("/updateData")
    public void updateData(@RequestBody Student s)
    {
    	hs.saveData(s);
    }
    
    @DeleteMapping("/deleteData/{stuid}")
    public String deleteData(@PathVariable int stuid)
    {
    	hs.deleteData(stuid);
		return "Delete Successfully";
    }
    @PostMapping("/regAddr")
    public String saveAddr(@RequestBody Address adr)
    {
    	System.out.println(adr);
    	hs.saveaddrdata(adr);
		return "Save Address Data Successfully";
    	
    }
}
