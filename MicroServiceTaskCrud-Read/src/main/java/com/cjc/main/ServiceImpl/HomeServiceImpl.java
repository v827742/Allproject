package com.cjc.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Repository.HomeRepository;
import com.cjc.main.model.Student;
import com.cjc.main.serviceI.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{

	
	@Autowired
	HomeRepository hr;

	@Override
	public List<Student> logData() {
	
		List<Student> slist=(List<Student>) hr.findAll();
		return slist;
	}
	

}
