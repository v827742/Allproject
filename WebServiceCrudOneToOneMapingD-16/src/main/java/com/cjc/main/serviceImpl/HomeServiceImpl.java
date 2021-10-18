package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Address;
import com.cjc.main.model.Student;
import com.cjc.main.repository.AddressRepository;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.serviceI.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{
    @Autowired
	StudentRepository sr;
    @Autowired
    AddressRepository ar;
    
	@Override
	public void saveData(Student s) {
		
		sr.save(s);
		
	}


	@Override
	public void addrData(Address a) {
		
		ar.save(a);
	}

}
