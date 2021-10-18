package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.HomeRepository.HomeRepository;
import com.cjc.main.model.Employee;
import com.cjc.main.serviceI.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{
    @Autowired
	HomeRepository hr;
	
    @Override
	public void saveData(Employee e) {
		
		hr.save(e);
	}

	@Override
	public Employee logCheck(String uname, String Pass) {
		
		Employee emp=hr.findAllByUnameAndPass(uname, Pass);
		return emp;
	}

	@Override
	public Iterable<Employee> getAllData() {
	      
		return hr.findAll();
	}

	@Override
	public Iterable<Employee> getOneData(String uname, String pass) {
		Iterable<Employee> emp=hr.findByUnameAndPass(uname, pass);
		return emp;
	}

	@Override
	public Employee editData(int empid) {
	
		return hr.findAllByEmpid(empid);
	}

	@Override
	public void deleteData(int empid) {
		hr.deleteById(empid);
		
	}

}
