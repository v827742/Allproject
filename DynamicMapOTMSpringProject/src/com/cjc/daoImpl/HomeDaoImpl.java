package com.cjc.daoImpl;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.daoI.HomeDaoI;
import com.cjc.model.Student;

@Repository
public class HomeDaoImpl implements HomeDaoI{
    @Autowired
	SessionFactory sf;
	@Override
	public int saveData(Student s) {
		
		Session ses=sf.openSession();
		int id=(int) ses.save(s);
		ses.beginTransaction().commit();
		return id;
	}
	@Override
	public List<Student> loginCheck(String email, String pass) {
		Session ses=sf.openSession();
		if(email.equals("admin")&&pass.equals("admin"))
		{
			List<Student> slist=displayAll();			
			System.out.println(slist);
			return slist;
		}
		else {
			Query<Student> que=ses.createQuery("from Student where email=:email and pass=:pass");
			que.setParameter("email", email);
			que.setParameter("pass", pass);
			List<Student> slist=que.getResultList();
			
	   return slist;
		}
	}
	@Override
	public List<Student> displayAll() {
		
		Session s=sf.openSession();
		Query<Student> que=s.createQuery("from Student");
		List<Student> slist=que.getResultList();
		return slist;
	}
	@Override
	public Student editData(int rollno) {
	Session s=sf.openSession();
	Student stu=s.get(Student.class, rollno);
	
	System.out.println(rollno);
		return stu;
	}
	@Override
	public List<Student> updateData(Student s) {
		Session ses=sf.openSession();
     Transaction tx=ses.beginTransaction();
		ses.update(s);
		tx.commit();
		List<Student> slist=displayAll();
		return slist;
	}
	@Override
	public List<Student> deleteData(Student s) {
		Session ses=sf.openSession();
	    Transaction tx=ses.beginTransaction();
	    ses.delete(s);
	    tx.commit();
	    List<Student> slist=displayAll();
		return slist;
	}

}
