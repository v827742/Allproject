 package com.cjc.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

	public List<Student> findAllByUnameAndPass(String uname,String Pass);
	
	public Student findAllByRollno(int rollno);
}
