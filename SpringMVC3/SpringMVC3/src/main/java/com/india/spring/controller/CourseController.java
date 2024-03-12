package com.india.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.india.spring.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	CourseService courseService;

	public CourseController() {
		System.out.println("CourseController - D.C");
	}

	@GetMapping(value = "myjava.do")
	public String getJavaCourses(HttpServletRequest request) {
		System.out.println("CC - getJavaCourses()");
		List<String> mylist = courseService.getJavaCourses();
		request.setAttribute("MyCourses", mylist);
		request.setAttribute("CourseName", "Java");
		return "show";
	}

	//@GetMapping(value = "myspring.do")
	@RequestMapping(value = "myspring.do", method = RequestMethod.GET)
	public String getSpringCourses(HttpSession session) {
		System.out.println("CC - getSpringCourses()");
		List<String> mylist = courseService.getSpringCourses();
		session.setAttribute("MyCourses", mylist);
		session.setAttribute("CourseName", "Spring");
		return "show";
	}
	
	@GetMapping(value = "myweb.do")
	public @ResponseBody String getMyWebCourses() {
		System.out.println("CC - getJavaCourses()");
		List<String> mylist = courseService.getJavaCourses();
		System.out.println(mylist);
		return mylist.toString();
	}
}