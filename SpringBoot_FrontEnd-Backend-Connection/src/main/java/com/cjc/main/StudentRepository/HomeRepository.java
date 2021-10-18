package com.cjc.main.StudentRepository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.Model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{

	
	
	
	public Student findAllBySid(int sid);

	public Student deleteDataBySid(int sid);
		
	
	
}
