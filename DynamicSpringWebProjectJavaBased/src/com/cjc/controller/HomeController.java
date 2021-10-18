package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.ServicI.HomeServiceI;
import com.cjc.model.OrderInfo;
import com.cjc.model.ProductInfo;

@Controller
public class HomeController {
    @Autowired
	HomeServiceI hs;
	
    @RequestMapping("/")
	public String firstPage()
	{
		return "main";
		
	}
    @RequestMapping("/pro")
    public String proPage()
    {
		return "product";
    	
    }
    
    @RequestMapping("/ord")
    public String ordPage()
    {
		return "order";
    	
    }
    
    @RequestMapping("/prdct")
    public String saveProData(@ModelAttribute("pro") ProductInfo pi,Model m)
    {
    	int id=hs.saveProduct(pi);
    	
    	if(id>0)
    	{
    	return "main";	
    	}
    	else {
		return "product";
    	}
    }
    
    @RequestMapping("/ordr")
    public String saveProData(@ModelAttribute("od") OrderInfo oi,Model m)
    {
    	int id=hs.saveOrder(oi);
    	
    	if(id>0)
    	{
    	return "main";	
    	}
    	else {
		return "Order";
    	}
    }
    
}
