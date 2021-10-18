package com.cjc.main.serviceI;


import java.util.List;

import com.cjc.main.model.Student;

public interface HomeServiceI {

	public void saveData(Student s);
 
	public List<Student> findalldata(String uname,String pass);
	
	public Student editData(int rollno);
	
	public Student findOneData();
	
	public void deleteData(int rollno);
	
}
