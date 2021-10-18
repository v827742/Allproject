package com.cjc.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Employee;

@Repository
public interface HomeRepository extends JpaRepository<Employee, Integer>{

	
	public List<Employee> findAllByUnameAndPass(String uname,String pass);
	
	public List<Employee> findAllByEid(int eid);
}
