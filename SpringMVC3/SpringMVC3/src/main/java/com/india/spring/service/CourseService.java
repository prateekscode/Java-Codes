package com.india.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.india.spring.daoimpl.CourseDaoImpl;

@Component
public class CourseService {
	
	@Autowired
	CourseDaoImpl courseDaoImpl;
		
	public CourseService() {
			System.out.println("CourseService - D.C");
		}

		public List<String> getJavaCourses() {
			
			int result=courseDaoImpl.add();
			System.out.println("Result :"+result);
			System.out.println("CS - getJavaCourses()");
			List<String> mylist = new ArrayList<>();
			mylist.add("Java8");
			mylist.add("JDBC");
			mylist.add("Servlets");
			mylist.add("JSP");
			return mylist;
		}

		public List<String> getSpringCourses() {
			System.out.println("CS - getSpringCourses()");
			List<String> mylist = new ArrayList<>();
			mylist.add("Spring5");
			mylist.add("Spring Rest");
			mylist.add("Srping MVC");
			mylist.add("Spring Boot");
			return mylist;
		}

		public List<String> getWebCourses() {
			System.out.println("CS - getWebCourses()");
			List<String> mylist = new ArrayList<>();
			mylist.add("Java Script");
			mylist.add("Angular");
			mylist.add("React JS");
			mylist.add("Vue JS");
			return mylist;
		}
	}


