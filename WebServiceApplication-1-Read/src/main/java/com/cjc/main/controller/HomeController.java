package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

	@Autowired
	RestTemplate restTemp;
	
	@GetMapping("/getAllData")
	public List getAllData()
	{
		
	String	url="http://localhost:2301/getData";
	
	List ad=restTemp.getForObject(url, List.class);
		return ad;
		
		
	}
}
