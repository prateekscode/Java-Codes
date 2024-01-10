package com.prateekscode.test;

import org.hibernate.cfg.Configuration;
import com.prateekscode.entity.Product;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveObjectTest {

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
		product.setPid(17);
		product.setPname("Optical Mouse rgb");
		product.setPrice(350.0f);
		product.setQty(1.0f);
		
		try {
			tx=session.beginTransaction();
			//saving the object
			session.save(product);
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
