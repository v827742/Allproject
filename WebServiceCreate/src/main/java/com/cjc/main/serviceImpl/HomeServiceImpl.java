package com.cjc.main.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.serviceI.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{
    @Autowired
	HomeRepository hr;
	@Override
	public void saveData(Student s) {
		
		 hr.save(s);
		
	}

}
