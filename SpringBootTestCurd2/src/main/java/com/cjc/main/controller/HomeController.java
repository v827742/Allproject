package com.cjc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String preLog()
	{
		return "index";
	}
	@RequestMapping("/log")
	public String LogCheck(@RequestParam("uname") String uname,@RequestParam("pass") String pass)
	{
		System.out.println("Username: "+uname);

		System.out.println("PassWord: "+pass);
		
		return "index";
	}
	@RequestMapping("/register")
	public String preReg() {
		
		return "register";
	}
	@RequestMapping("/reg")
	public String RegData(@ModelAttribute User u,Model m)
	{
		System.out.println(u.getUid());
		System.out.println(u.getUname());
	
		System.out.println(u.getPass());
		System.out.println(u.getName());
		System.out.println(u.getAddress());
		System.out.println(u.getMono());
		m.addAttribute("data", u);
		return "success";
	}
}
