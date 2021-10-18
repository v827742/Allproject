package com.cjc.main.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
	@RequestMapping("/register")
	public String preReg()
	{
		
		return "register";
		
	}
	@RequestMapping("/reg")
	public String RegData(@Valid @ModelAttribute Student stu)
	{
		
		System.out.println(stu.getRollno());
		System.out.println(stu.getUname());
		System.out.println(stu.getPass());
		System.out.println(stu.getName());
		System.out.println(stu.getMobNo());
		System.out.println(stu.getAddr());
	
		hs.saveData(stu);
		return "login";
		
	}
}
