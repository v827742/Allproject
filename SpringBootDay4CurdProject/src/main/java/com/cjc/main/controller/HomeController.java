package com.cjc.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
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
	public String logCheck(@RequestParam("uname")String uname,@RequestParam("pass") String pass,Model m)
	{
		System.out.println("uname :"+uname);
		System.out.println("Passwordv:"+pass);
		
		Student stu=hs.loginCheck(uname,pass);
		
		
	if(uname.equals("admin")&&pass.equals("admin"))
			{
			Iterable<Student> list=hs.getAllData();
			m.addAttribute("data", list);
			return "success";
		}
		
		else
		{
			Iterable<Student> list=hs.getOneData(uname,pass);
			m.addAttribute("data", list);
			return "success";
	}
		
	}
	
	@RequestMapping("/register")
	public String preReg()
	{
		
		return "register";
		
	}
	@RequestMapping("/reg")
	public String RegData(@ModelAttribute Student stu)
	{
		
		
		System.out.println(stu.getSid());
		System.out.println(stu.getRollno());
		System.out.println(stu.getUname());
		System.out.println(stu.getPass());
		System.out.println(stu.getName());
		System.out.println(stu.getMono());
		System.out.println(stu.getAddr());
	
		hs.saveData(stu);
		return "login";
		
	}
	
	@RequestMapping("/edit")
	public String editRecord(@RequestParam("sid") int sid,Model m)
	{
		
		Student stu=hs.editData(sid);
		
		m.addAttribute("data", stu);
		return "update";
		
	}
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student s,Model m)
	{
		
		hs.saveData(s);
		Iterable<Student> list=hs.getAllData();
		m.addAttribute("data", list);
		
		return "success";
		
	}
	@RequestMapping("/delete")
	public String deleteData(@RequestParam("sid") int sid,Model m)
	{
		hs.deleteData(sid);
		Iterable<Student> list=hs.getAllData();
		m.addAttribute("data", list);
		
		return "success";
		
	}
	
	
}
