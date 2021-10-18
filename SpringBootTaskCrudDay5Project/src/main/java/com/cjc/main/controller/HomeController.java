package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Employee;

import com.cjc.main.serviceI.HomeServiceI;

@Controller
public class HomeController {
     @Autowired
	HomeServiceI hs;
     @RequestMapping("/")
     public String preLog()
     {
    	 
    	 return "login";
     }
     @RequestMapping("/log")
     public String logCheck(@RequestParam("uname") String uname,@RequestParam("pass") String pass,Model m)
     {
    	 Employee emp =hs.logCheck(uname, pass);
    	 
    	 if(uname.equals("admin")&&pass.equals("admin"))
    	 {
    		 Iterable<Employee> elist=hs.getAllData();
    		 m.addAttribute("data", elist);
    	 return "success";
    	 }
    	 else {
    		 Iterable<Employee> emplist=hs.getOneData(uname, pass);
    		 m.addAttribute("data", emplist);
    		 return "success";
    	 }
     }
     @RequestMapping("/register")
     public String preReg()
     {
    	 
    	 return "register";
     }
     
     @RequestMapping("/reg")
     public String regData(@ModelAttribute("emp") Employee em)
     {
    	 hs.saveData(em);
    	
    	 return "login";
     }
     
     @RequestMapping("/edit")
 	public String editRecord(@RequestParam("empid") int empid,Model m)
 	{
 		
 		Employee emp=hs.editData(empid);
 		
 		m.addAttribute("data", emp);
 		return "update";
 		
 	}
 	@RequestMapping("/update")
 	public String updateData(@ModelAttribute("empid") Employee e,Model m)
 	{
 		
 		 hs.saveData(e);
 		 
 		Iterable<Employee> list=hs.getAllData();
 		m.addAttribute("data", list);
 		
 		return "success";
 		
 	}
 	@RequestMapping("/delete")
 	public String deleteData(@RequestParam("empid") int empid,Model m)
 	{
 		hs.deleteData(empid);
 		Iterable<Employee> list=hs.getAllData();
 		m.addAttribute("data", list);
 		
 		return "success";
 		
 	}
 	
     
}
