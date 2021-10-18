package com.cjc.main.serviceI;



import com.cjc.main.model.Student;

public interface HomeServiceI {

	public void saveData(Student s);
	
	public Student loginCheck(String uname,String pass);
	
	
	public Iterable<Student> getAllData();
	
	public Iterable<Student> getOneData(String uname,String pass);
	
	public Student editData(int sid);
	
	public void deleteData(int sid);
	
}
