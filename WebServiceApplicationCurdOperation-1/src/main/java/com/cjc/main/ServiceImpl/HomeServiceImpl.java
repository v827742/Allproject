package com.cjc.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Repository.HomeRepository;
import com.cjc.main.ServiceI.HomeServiceI;
import com.cjc.main.model.Employee;

@Service
public class HomeServiceImpl implements HomeServiceI{
    @Autowired
	HomeRepository hr;
	@Override
	public void saveData(List<Employee> e) {
		
		hr.saveAll(e);
		
		
	}
	@Override
	public List<Employee> login(String uname, String pass) {
		
		List<Employee> elist=hr.findAllByUnameAndPass(uname, pass);
		return elist;
	}
	@Override
	public List<Employee> editData(int eid) {
		List<Employee> elist= hr.findAllByEid(eid);
		return elist;
	}
	@Override
	public void deleteRecord(int eid) {
		
		hr.deleteById(eid);
		
	}
	

}
