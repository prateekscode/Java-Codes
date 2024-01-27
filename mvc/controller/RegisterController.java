package com.mvc.controller;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.dto.RegisterDTO;
import com.mvc.service.RegisterService;
import com.mvc.service.impl.RegisterServiceImpl;


@WebServlet("/register.do")
public class RegisterController extends HttpServlet {
	
	private RegisterService registerService;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		registerService=new RegisterServiceImpl();
		
		String fullName = req.getParameter("fname");
		String userName = req.getParameter("uname");
		String Password = req.getParameter("pwd");
		String Cpassword = req.getParameter("cpwd");
		String Email = req.getParameter("email");
		String Phone = req.getParameter("phone");
		String Gender = req.getParameter("gender");
		String[] Courses = req.getParameterValues("course");
		String Timings = req.getParameter("timings");
		String Remarks = req.getParameter("remarks");

		String msg="";
		System.out.println(fullName + "\t" + userName + "\t" + Email + "\t" + Phone + "\t" + Gender + "\t" + Timings
				+ "\t" + Remarks);
		String courses = "";
		System.out.println("Courses:");
		for (String a : Courses) {
			courses = courses + "," + a;
			System.out.println(a);
		}

		RegisterDTO registerDTO=new RegisterDTO(fullName,userName,Password,Cpassword,Email,Phone,Gender,courses,Timings,Remarks);
		
		if (Password.equals(Cpassword)) {
			int result=registerService.registerUser(registerDTO);;

		} else {
			System.out.println("Password and Confirm Password mismatched..Please provide same passwords");
			msg = "<h2>Password and Confirm Password mismatched..Please provide same passwords</h2>";
		}

		Writer out = resp.getWriter();
		out.write(msg);
		out.write("<br/>");
		out.write("<br>/");
		
		RequestDispatcher rd=req.getRequestDispatcher("/Home.html");
		rd.include(req, resp);
	}

}
