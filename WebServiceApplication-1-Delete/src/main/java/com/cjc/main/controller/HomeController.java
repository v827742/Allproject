package com.cjc.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

	
	
	@Autowired
	RestTemplate restTemp;
	
	@DeleteMapping("/deltData/{sid}")
	public String deleteReco(@PathVariable("sid") int sid)
	{
		
		String url="http://localhost:2301/deleteData"+"/"+sid;
		restTemp.postForObject(url, "/sid" ,String.class );
		return "delete Successfull";
		
	}
}
