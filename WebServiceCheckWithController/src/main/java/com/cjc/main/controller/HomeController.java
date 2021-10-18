package com.cjc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.main.model.ProductOrder;

@Controller 
public class HomeController {

	ProductOrder  pro=new ProductOrder();
	
	@RequestMapping("/")
	public ProductOrder m1()
	{
	   
	   pro.setPoid(1);
	   pro.setCustname("Ashih");
	   pro.setPname("Tata Tea");
	   pro.setPmfgdate("25/1/2000");
	   pro.setPexpdate("25/1/2022");
	   pro.setPrice(25.50);
		return pro;
		
	}
}
