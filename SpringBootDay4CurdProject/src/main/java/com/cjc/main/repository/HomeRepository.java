package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{

	
	public Student findAllByUnameAndPass(String uname,String pass);
	
	public Student findAllBySid(int sid);
	
	public Iterable<Student> findByUnameAndPass(String uname,String pass);
}
