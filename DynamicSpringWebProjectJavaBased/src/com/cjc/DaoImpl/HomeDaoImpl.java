package com.cjc.DaoImpl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.DaoI.HomeDaoI;
import com.cjc.model.OrderInfo;
import com.cjc.model.ProductInfo;

@Repository
public class HomeDaoImpl implements HomeDaoI{
    @Autowired
	SessionFactory sf;
	@Override
	public int saveProduct(ProductInfo pi) {
	 
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		int id=(int) s.save(pi);
		tx.commit();
		return id;
	}

	@Override
	public int saveOrder(OrderInfo oi) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		int id=(int) s.save(oi);
		tx.commit();
		return id;
	}

	
}
