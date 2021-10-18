package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Address;
import com.cjc.main.model.Student;

public interface HomeServiceI {
	
	public void saveData(Student stu);
	public List<Student> savelistData(List<Student> liststu);
	public List<Student> getAllData();
	
	
	public Student getSingleData(int id);
	
	public Student editData(int stuid);
	
	public Student update(Student stu);
	public void deleteData(int id);
	public void saveaddrdata(Address adr);
	


}
