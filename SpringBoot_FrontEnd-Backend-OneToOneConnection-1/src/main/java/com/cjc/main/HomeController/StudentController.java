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
public class StudentController {
    @Autowired
	HomeServiceI hsi;
    
    
	@PostMapping("/saveData")
	public String saveData(@RequestBody Student stu)
	{
		hsi.saveData(stu);
		return "save Data Succsessfully";
		
	}
	@GetMapping("/getAllData")
	public List<Student> getAllData()
	{

		return hsi.getAllData();
		
	}
	@GetMapping("/edit/{stuid}")
	public Student edit(@PathVariable int stuid)
	{
		
		return hsi.editData(stuid);
		
	}
	@PutMapping("/update")
	public  Student updateData(@RequestBody Student stu)
	{
		return hsi.updateData(stu);
		
	}
	@DeleteMapping("/delete/{stuid}")
	public void deleteData(@PathVariable int stuid)
	{
		hsi.deleteData(stuid);
	}
	
}
