package com.india.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

import com.india.util.HibernateUtil;

public class OpsLab2 {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			tx = session.beginTransaction();
			
			Student stu = new Student("Prateek","21/01/2002","MCA");
			
			String courses[] = { "Hibernate", "Spring", "Spring Boot", "Angular" };
			
			List<String> skills = new ArrayList<>();
			skills.add("Java8");
			skills.add("JDBC");
			skills.add("Servlets");
			skills.add("JSP");
			
			List<Integer> marks = new ArrayList<>();
			marks.add(80);
			marks.add(85);
			marks.add(88);
			marks.add(92);
			
			stu.setCourses(courses);
			stu.setSkills(skills);
			stu.setMarks(marks);
			
			session.save(stu);

			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}
}
