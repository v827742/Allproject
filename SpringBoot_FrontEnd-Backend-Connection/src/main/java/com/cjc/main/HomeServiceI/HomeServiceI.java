package com.cjc.main.HomeServiceI;

import java.util.List;

import com.cjc.main.Model.Student;

public interface HomeServiceI {

	public void saveData(Student stu);
	
	public List<Student> getAllData();
	
	
	
	public Student editData(int sid);
	
	public Student  updateData(Student sid);
	
	public void deleteData(int id);
}
