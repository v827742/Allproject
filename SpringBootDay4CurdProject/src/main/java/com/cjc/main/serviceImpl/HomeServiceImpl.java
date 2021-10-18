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
	@Override
	public Student loginCheck(String uname, String pass) {
		
		Student stu=hr.findAllByUnameAndPass(uname, pass);
		return stu;
	}
	@Override
	public Iterable<Student> getAllData() {
		
		return hr.findAll();
	}
	@Override
	public Student editData(int sid) {
		
		return hr.findAllBySid(sid);
	}
	@Override
	public void deleteData(int sid) {
	hr.deleteById(sid);
		
	}
	@Override
	public Iterable<Student> getOneData(String uname, String pass) {
		Iterable<Student> stu=hr.findByUnameAndPass(uname, pass);
		return stu;
	}
	

}
