package com.cjc.main.HomeRepository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Employee;

@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer>{

	
	public Employee findAllByUnameAndPass(String uname,String pass);
	
	public Employee findAllByEmpid(int empid);
	
	public Iterable<Employee> findByUnameAndPass(String uname,String Pass);
}
