package com.cjc.main.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.ProductOrder;

@RestController 
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
	@RequestMapping("/pname")
	public String m2()
	{
		
	     String name=pro.getPname();
		return name;
		
	}
	@RequestMapping("/price")
	public Double m3()
	{
		
	     Double p=pro.getPrice();
		return p;
		
	}
	@RequestMapping(value="/listdata",method = RequestMethod.GET)
	public List listData()
	{   
		ProductOrder  po=new ProductOrder();
		List list=new ArrayList();
		po.setPoid(5);
		po.setPname("Alto cv0.4");
		po.setCustname("Neel");
		po.setPmfgdate("25/01/2021");
		po.setPexpdate("25/1/2036");
		po.setPrice(630000);
		
		pro.setPoid(6);
		pro.setPname("Indica v0.8");
		pro.setCustname("Shivraj");
		pro.setPmfgdate("25/01/2021");
		pro.setPexpdate("25/1/2036");
		po.setPrice(830000);
		
		list.add(po);
		list.add(pro);
		
		return list;
		
	}
	@RequestMapping(value="/regdata",method=RequestMethod.POST)
	public ProductOrder regData(@RequestBody ProductOrder pro)
	{
		return pro;
		
	}
}
