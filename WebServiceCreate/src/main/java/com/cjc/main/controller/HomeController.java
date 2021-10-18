package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		return "Create";
	}
	@RequestMapping("/reg")
	public String regData(@ModelAttribute Student s,Model m)
	{
	       hs.saveData(s);
		
		return "succ";
	}
}
