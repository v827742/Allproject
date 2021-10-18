package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Student;

public interface HomeServiceI {

	public List<Student> logData();
	
	public List<Student> update(List<Student> s );
}
