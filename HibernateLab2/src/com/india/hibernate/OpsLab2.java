package com.india.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.*;


public class OpsLab2 {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			AnnotationConfiguration	cfg=new AnnotationConfiguration();
			cfg=(AnnotationConfiguration)cfg.configure();
			
			SessionFactory sessionFactory=cfg.buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			tx=session.beginTransaction();
			
			Record rc=new Record("Master","Jaipur","MSt@gmail.com",11332266);
			session.save(rc);
			
			tx.commit();
			session.close();
					
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}
}
