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
import com.eshop.model.ProductDetails;

@Repository
public class CatDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void insertuser(CategoryDetails cd)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.saveOrUpdate( cd);
		t.commit();
		session.close();
    }
	public  List prodcat()
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		String hql="from CategoryDetails ";
		Query query = session.createQuery(hql);
		List r = query.list(); 
		session.close();
		return r;	
	}
	
	public  void Deletecategory(int cid)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		CategoryDetails c=(CategoryDetails)session.get(CategoryDetails.class,cid);
		session.delete(c);
		t.commit();
		session.close();
	}
	
	public CategoryDetails getcategory(int catid)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		CategoryDetails c=(CategoryDetails)session.get(CategoryDetails.class,catid);
		session.close();
	    return c;
	}
}
	
