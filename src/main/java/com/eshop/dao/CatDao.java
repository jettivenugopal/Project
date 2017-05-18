package com.eshop.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CategoryDetails;

@Repository
public class CatDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void insertuser(CategoryDetails cd)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(cd);
		t.commit();
}
	public  List prodcat()
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		String hql="from CategoryDetails ";
		Query query = session.createQuery(hql);
		List r = query.list(); 
	
		return r;	
	}
}
