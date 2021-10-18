package com.cjc.main.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.HomeRepository.AddressRepository;
import com.cjc.main.HomeRepository.StudentRepository;
import com.cjc.main.model.Address;
import com.cjc.main.model.Student;
import com.cjc.main.serviceI.HomeServiceI;

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
		
		List<Student> stulist=(List<Student>) sr.saveAll(liststu);
		return stulist;
	}

	@Override
	public List<Student> getAllData() {
		
		List<Student> alldata=(List<Student>) sr.findAll();
		return alldata;
	}

	@Override
	public Student editData(int stuid) {
		Student stu = sr.findByStuid(stuid);
		return stu;
	}

	@Override
	public void deleteData(int id) {
		
		sr.deleteById(id);
		
	}

	@Override
	public void saveaddrdata(Address adr) {
		
		
		ar.save(adr);
		
	}

	@Override
	public Student getSingleData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Student stu) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
