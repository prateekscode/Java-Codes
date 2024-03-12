package com.india.spring.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.india.spring.entity.Login;

@Repository
public class CourseDaoImpl {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public int add() {
		Login login=new Login(1,"RAJ");
		hibernateTemplate.save(login);
		return 0;
	}

}
