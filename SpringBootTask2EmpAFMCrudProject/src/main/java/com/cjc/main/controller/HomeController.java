package com.cjc.main.controller;


import java.util.List;

import javax.persistence.Embeddable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
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
	public String logCheck(Model m)
	{
		
		List<Employee> elist=hs.logCheck();
		for(Employee em:elist)
		{
			System.out.println(em.getEid());
			System.out.println(em.getUname());
			System.out.println(em.getPass());
			System.out.println(em.getName());
			System.out.println(em.getAddr());
			System.out.println(em.getMono());
		}
		m.addAttribute("data", elist);
		return "success";	
	}
	
	@RequestMapping("/register")
	public String preReg()
	{
		
		return "register";
		
	}
	@RequestMapping("/reg")
	public String RegData(@ModelAttribute Employee em)
	{
		
		
	
		
		hs.saveData(em);
		return "login";
		
	}
}
