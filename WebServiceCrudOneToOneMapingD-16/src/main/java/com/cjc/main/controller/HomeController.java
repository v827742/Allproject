package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.main.model.Address;
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
	public String regData(@ModelAttribute Student s)
	{
		hs.saveData(s);
		return "login";
	}
	
	@RequestMapping("/adddata")
	public String addReg()
	{
		
		return "regadd";
	}
	
	@RequestMapping("/addreg")
	public String regData(@ModelAttribute Address ad)
	{
		hs.addrData(ad);
		return "login";
	}
}
