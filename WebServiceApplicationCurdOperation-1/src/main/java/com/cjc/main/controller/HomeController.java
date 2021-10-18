package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.ServiceI.HomeServiceI;
import com.cjc.main.model.Employee;

@RestController
public class HomeController {
    @Autowired
	HomeServiceI hs;
    
  
    @PostMapping("/saveAll")
    public String saveData(@RequestBody List<Employee> e)
    {
    	
    	hs.saveData(e);
		return "create operation Successfully Executed";
    	
    }
    
    @RequestMapping(value="/login/{uname}/{pass}")
    public List<Employee> logCheck(@PathVariable("uname")String uname,@PathVariable("pass") String pass )
    {
    	List<Employee> elist=hs.login(uname,pass);
		return elist;
    	
    }
    
    @GetMapping("edit/{eid}")
    public List<Employee> editRecord(@PathVariable("eid") int eid)
    {
    	List<Employee> elist=hs.editData(eid);
		return elist;
    	
    }
    @PutMapping("update")
    public String updateData(@RequestBody List<Employee> e)
    {
    	hs.saveData(e);
    	
		return "Update Successfully";
    	
    }
    @DeleteMapping("delete/{eid}")
    public String deleteData(@PathVariable("eid") int eid)
    {
    	hs.deleteRecord(eid);
    	
		return "delete Successfully";
    	
    }
    
}
