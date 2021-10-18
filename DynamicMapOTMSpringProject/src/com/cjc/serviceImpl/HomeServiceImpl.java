package com.cjc.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.daoImpl.HomeDaoImpl;
import com.cjc.model.Student;
import com.cjc.serviceI.HomeServiceI;
@Service
public class HomeServiceImpl implements HomeServiceI{
    @Autowired
	HomeDaoImpl hd;
	@Override
	public int saveData(Student s) {
		
		return hd.saveData(s);
	}
	@Override
	public List<Student> loginCheck(String email, String pass) {
		
		return hd.loginCheck(email, pass);
	}
	@Override
	public List<Student> displayAll() {
		// TODO Auto-generated method stub
		return hd.displayAll();
	}
	@Override
	public Student editData(int rollno) {
		
		return hd.editData(rollno);
	}
	@Override
	public List<Student> updateData(Student s) {
	
		return hd.updateData(s);
	}
	@Override
	public List<Student> deleteData(Student s) {
		
		return hd.deleteData(s);
	}
	

}
