package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.main.model.Student;

import com.cjc.main.repository.StudentRepository;
import com.cjc.main.serviceI.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{
    @Autowired
	StudentRepository sr;
  
    
	@Override
	public void saveData(Student s) {
		
		sr.save(s);
		
	}


	@Override
	public List<Student> findalldata(String uname, String pass) {
		List<Student> stu=sr.findAllByUnameAndPass(uname, pass);
		return stu;
	}


	@Override
	public Student editData(int rollno) {
		
		Student s=sr.findAllByRollno(rollno);
		return s;
	}


	@Override
	public Student findOneData() {
		
		return (Student) sr.findAll();
	}


	@Override
	public void deleteData(int rollno) {
      
		sr.deleteById(rollno);
		
	}


	
}
