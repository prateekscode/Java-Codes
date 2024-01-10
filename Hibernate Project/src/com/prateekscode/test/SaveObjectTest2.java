package com.prateekscode.test;

import org.hibernate.cfg.Configuration;
import com.prateekscode.entity.Product;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveObjectTest2 {

	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction tx=null;
		
		//Configuration
		cfg=new Configuration();
		cfg.configure("com/prateekscode/cfg/hibernate.cfg.xml");
		
		sessionFactory=cfg.buildSessionFactory();
		session=sessionFactory.openSession();
		
		//entity
		Product product=new Product();
//		Dynamically generated queries works on wrapper classes or object not for primitive 
		product.setPid(15);
		product.setPname("CD Drive Cabinet");
		product.setPrice(2300.0f);
		product.setQty(1.0f);
		
		try {
			tx=session.beginTransaction();
			System.out.println("Before save method...............");
			//saving the object and it returns serializable Wrapper object
			int idValue=(int)session.save(product);
			System.out.println("The id is:"+idValue);
			System.out.println("After save method................");
			//all non select operation should be committed
			tx.commit();
			System.out.println("Object is saved successfully.");
		}
		catch(HibernateException ex) {
			ex.printStackTrace();
		}
		finally{
		session.close();
		sessionFactory.close();
		
		}
		
	}

}
