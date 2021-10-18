package com.cjc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String main()
	{
		return "index";
		
	}
	
    @RequestMapping("/reg")
   	public String regData()
   	{
   		return "register";
   		
   	}
    @RequestMapping("/updt")
   	public String updateData()
   	{
   		return "update";
   		
   	}
    @RequestMapping("/delt")
   	public String deleteData()
   	{
   		return "delete";
   		
   	}
}
