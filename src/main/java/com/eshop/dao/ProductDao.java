package com.eshop.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;

@Repository
public class ProductDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void insertpro(ProductDetails pd)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.saveOrUpdate(pd);
		t.commit();
     }
	
	public  List product()
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		String hql="from ProductDetails ";
		Query query = session.createQuery(hql);
		List r = query.list(); 
		return r;	
	}
	public  void Deleteproduct(int productid)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		ProductDetails p=(ProductDetails)session.get(ProductDetails.class,productid);
		session.delete(p);
		t.commit();
		session.close();
	}
	
	public ProductDetails getproduct(int prodid)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		ProductDetails p=(ProductDetails)session.get(ProductDetails.class,prodid);
	    return p;
	}
	
	
}


