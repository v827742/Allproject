package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.serviceI.HomeServiceI;

@RestController
public class HomeController {

	@Autowired
	HomeServiceI hs;
	
	@DeleteMapping("/deleteData/{sid}")
	public String deleteData(@PathVariable int sid)
	{
		hs.deltData(sid);
		return "Delete Data From DataBase Successfully";
		
		
	}
	
	
}
