package com.cjc.main.HomeServiceI;

import java.util.List;

import com.cjc.main.Model.Address;
import com.cjc.main.Model.Student;

public interface HomeServiceI {

	public void saveData(Student stu);
	public List<Student> savelistData(List<Student> liststu);
	public List<Student> getAllData();
	
	
	public Student getSingleData(int id);
	
	public Student editData(int stuid);
	
	public Student updateData(Student stu);
	public void deleteData(int id);
	public void saveaddrdata(Address adr);
	


}

