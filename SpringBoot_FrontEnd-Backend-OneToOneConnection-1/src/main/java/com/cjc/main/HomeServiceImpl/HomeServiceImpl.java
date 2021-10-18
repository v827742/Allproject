package com.cjc.main.HomeServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.HomeRepasitory.AddressRepository;
import com.cjc.main.HomeRepasitory.StudentRepository;
import com.cjc.main.HomeServiceI.HomeServiceI;
import com.cjc.main.Model.Address;
import com.cjc.main.Model.Student;

@Service
public class HomeServiceImpl implements HomeServiceI{
    @Autowired
	StudentRepository sr;
    @Autowired
    AddressRepository ar;
	@Override
	public void saveData(Student stu) {
		
		sr.save(stu);
		
	}

	@Override
	public List<Student> savelistData(List<Student> liststu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllData() {
		
		return sr.findAll();
	}

	@Override
	public Student getSingleData(int id) {
		
		return null;
	}

	@Override
	public Student editData(int stuid) {
		
		return sr.findByStuid(stuid);
	}

	@Override
	public void deleteData(int id) {
		
		sr.deleteById(id);
		
	}

	@Override
	public void saveaddrdata(Address adr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student updateData(Student stu) {
		
		Student Stu=sr.save(stu);
		return Stu;
	}

}
