package com.eshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.AdminDetails;

@Repository
public class AdminDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void insertuser(AdminDetails ad)
	{
		Session session=sessionFactory.openSession();
		
		Transaction t=session.beginTransaction();
		
		session.save(ad);
		t.commit();
		
		
	}
}
