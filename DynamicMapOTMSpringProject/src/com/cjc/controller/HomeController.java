package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.cjc.model.Student;
import com.cjc.serviceImpl.HomeServiceImpl;

@Controller
public class HomeController {

	@Autowired
	HomeServiceImpl hs;
	
	@RequestMapping("/")
	public String firstPage()
	{
		return "main";
		
	}
//	@RequestMapping("/regg")
//	public String regPage()
//	{
//		return "register";
//		
//	}
	@RequestMapping("/reg")
	public String RegData(@ModelAttribute("stu")Student s ,Model m)
	{
		int id=hs.saveData(s);
			if(id>0)
		{
				List<Student> slist=hs.displayAll();
				
			m.addAttribute("data", slist);
			return "success";
		}
		else {
		return "main";
		}
	}
	
	@RequestMapping("/log")
	public String logCheck(@RequestParam("email")String email,@RequestParam("pass")String pass,Model m)
	{
	System.out.println(email);
	System.out.println(pass);
	
		List<Student> slist=hs.loginCheck(email, pass);
		
		m.addAttribute("data", slist);
		return "success";
		
	}
	@RequestMapping("/edit")
	public String logPage(@RequestParam("rollno")int rollno,Model m)
	{
		Student stu=hs.editData(rollno);
		System.out.println(rollno);
		m.addAttribute("data", stu);
		return "edit";
		
	}
	@RequestMapping("/update")
	public String updatedata(@ModelAttribute Student s,Model m)
	{
		List<Student> slist=hs.updateData(s);
		m.addAttribute("data", slist);
		return "success";
		
	}
	@RequestMapping("/delete")
	public String deleteData(@ModelAttribute Student s,Model m)
	{
		List<Student> slist=hs.deleteData(s);
		m.addAttribute("data", slist);
		return "success";
		
	}
	
}
