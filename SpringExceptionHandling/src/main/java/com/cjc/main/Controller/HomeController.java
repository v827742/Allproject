package com.cjc.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.ServiceI.HomeServiceI;
import com.cjc.main.model.MyOrder;


@RestController
public class HomeController {
    @Autowired
	HomeServiceI hsi;
    
    @PostMapping("/postData")
    public String addOrder(@RequestBody MyOrder order)
    {
    	hsi.addorder(order);
		return "Send Data into the DataBase Successfully";
    	
    }
    @GetMapping("/getData/{id}")
    public MyOrder addOrder(@PathVariable int id )
    {
    	
		return hsi.findData(id);
    	
    }
}
