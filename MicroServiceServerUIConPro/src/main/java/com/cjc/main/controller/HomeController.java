package com.cjc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String loginData()
	{
		
		
		return "login";
	}
	
	@RequestMapping("/reg")
	public String regData()
	{
		
		
		return "Register";
	}
}
