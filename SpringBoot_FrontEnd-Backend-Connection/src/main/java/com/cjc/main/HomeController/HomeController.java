package com.cjc.main.HomeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.HomeServiceI.HomeServiceI;
import com.cjc.main.Model.Student;

@CrossOrigin("*")
@RestController
public class HomeController {
    @Autowired
	HomeServiceI hsi;
	
    @PostMapping("/savedata")
    public String savaData(@RequestBody Student stu)
    {
    	hsi.saveData(stu);
		return "Save Data"; 
    	
    }
    
    @GetMapping("/getalldata")
    public List<Student> getAllData()
    {
    	return hsi.getAllData();
    }
    
    @GetMapping("/edit/{sid}")
    public Student editData(@PathVariable int sid)
    {
		return hsi.editData(sid);
    	
    }
    @PutMapping("/update")
    public Student updatedata(@RequestBody Student stu)
    {
		return hsi.updateData(stu);
    	
    }	
    @DeleteMapping("/delete/{sid}")
    public String deleteData(@PathVariable int sid)
    {
    	hsi.deleteData(sid);
		return " Delete Data Successfully ";
    	
    }
    
}
