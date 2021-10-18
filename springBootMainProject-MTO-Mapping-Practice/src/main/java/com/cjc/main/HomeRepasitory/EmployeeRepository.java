package com.cjc.main.HomeRepasitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cjc.main.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
	

	List<Employee> findByDepartment_Id(int id);

	
	
	
}
