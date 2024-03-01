package com.india.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	public static final SessionFactory getSessionFactory() {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg = (AnnotationConfiguration) cfg.configure();
		return cfg.buildSessionFactory();
	
	}

}
