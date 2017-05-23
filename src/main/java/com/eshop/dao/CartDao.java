package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CartDetails;
import com.eshop.model.ProductDetails;

@Repository
public class CartDao {
	@Autowired
	
	SessionFactory sessionfactory;
	
	public  List retrieveCart()
	{
		Session session=sessionfactory.openSession();
		Transaction t=session.beginTransaction();
		String hql="from CartDetails ";
		Query query = session.createQuery(hql);
		List r = query.list();
		session.close();
		return r;	
	}
	public void getcart(CartDetails cde)
	{
		Session session=sessionfactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(cde);
		t.commit();
		session.close();
	}
}
