package com.cjc.serviceI;

import java.util.List;

import com.cjc.model.Student;

public interface HomeServiceI {
	public int saveData(Student s);
	public List<Student> loginCheck(String email,String pass);
	public List<Student> displayAll();
    public Student editData(int rollno);
	public List<Student> updateData(Student s);
	public List<Student> deleteData(Student s);

}
