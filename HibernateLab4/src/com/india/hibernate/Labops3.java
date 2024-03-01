package com.india.hibernate;

import org.hibernate.*;

import com.india.util.HibernateUtil;

public class Labops3 {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			tx = session.beginTransaction();
			
			Ncustomer nc = new Ncustomer("Prateek","21/01/2002",995647);
			session.save(nc);
			
			Address ad = new Address("Kidwai Nagar","Kanpur","UP",208011);
			session.save(ad);
			
			

			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}
}
