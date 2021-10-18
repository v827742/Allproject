package com.cjc.main.serviceImpl;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.serviceI.HomeServiceI;

@Service
@Transactional
public class HomeServiceImpl implements HomeServiceI{
    @Autowired
	HomeRepository hr;
	@Override
	public void saveData(Employee em) {
		
		hr.save(em);
		
	}
	@Override
	public List<Employee> logCheck() {
		List<Employee> elist=(List<Employee>) hr.findAll();
		return elist;
	}
	

}
