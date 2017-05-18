package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.eshop.model.SupplierDetails;

@Repository
public class SupDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void insertSupp(SupplierDetails sd)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(sd);
		t.commit();
}
	public  List prodsup()
	{ 
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		String hql="from SupplierDetails ";
		Query query = session.createQuery(hql);
		List r = query.list(); 
		
		return r;
		
	}
	
	}


