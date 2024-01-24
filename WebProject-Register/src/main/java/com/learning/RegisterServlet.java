package com.learning;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fullName = req.getParameter("fname");
		String userName = req.getParameter("uname");
		String Password = req.getParameter("pwd");
		String Cpassword = req.getParameter("cpwd");
		String Email = req.getParameter("email");
		String Phone = req.getParameter("phone");
		String Gender = req.getParameter("gender");
		String[] Course = req.getParameterValues("course");
		String Timings = req.getParameter("timings");
		String Remarks = req.getParameter("remarks");
	
		String msg;

		if (Password.equals(Cpassword)) {
			msg = "<h2>Registration Successfull...</h2>";
			
		} else {
			msg = "<h2>Some Error Occurred</h2>";
		}
		
		System.out.println(msg);
		
		System.out.println(fullName + "\t" + userName + "\t" + Email + "\t" + Phone + "\t" + Gender + "\t" + Timings
				+ "\t" + Remarks);
		
		System.out.println("Courses:");
		for (String a : Course) {
			System.out.println(a);
		}

	

		Writer out = resp.getWriter();
		out.write(msg);
	}

}
