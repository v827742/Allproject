package com.service;



import org.hibernate.Session;

import com.HibernateUtil.HibernateUtil;
import com.model.Employee;

public class Test {
	public static void main(String[] args) {
		
	
	Session s=HibernateUtil.getsessionFactory().openSession();
	
	Employee e=new Employee();
	e.setEid(1);
	e.setName("ashish");
	e.setAddr("chandrapur");
	
	s.save(e);
	s.beginTransaction().commit();
	}
	
	
}
