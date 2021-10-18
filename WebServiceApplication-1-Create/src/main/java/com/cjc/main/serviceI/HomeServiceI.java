package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Student;

public interface HomeServiceI {

	
	public void saveData(Student s);
	
	public List<Student> getData();
	
	public void deleteRecord(int sid);
}
