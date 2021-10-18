package com.cjc.main.HomeRepasitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	public Student findByStuid(int stuid);
}
