package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.serviceI.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Employee em) {
		
		hr.save(em);
		
	}

	@Override
	public List<Employee> logCheck(String uname, String pass) {
		
		List<Employee> elist=hr.findAllByUnameAndPass(uname, pass);
		return elist;
	}

}
