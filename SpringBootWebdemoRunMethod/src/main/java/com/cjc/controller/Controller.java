package com.cjc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
@org.springframework.stereotype.Controller
public class Controller {
   
	
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
