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

		if (Password.equals(Cpassword)) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "prateek");
				String sql = "insert into register values(?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, fullName);
				ps.setString(2, userName);
				ps.setString(3, Password);
				ps.setString(4, Cpassword);
				ps.setString(5, Email);
				ps.setString(6, Phone);
				ps.setString(7, Gender);
				ps.setString(8, courses);
				ps.setString(9, Timings);
				ps.setString(10, Remarks);
				
				int result=ps.executeUpdate();
				
				if(result==1) {
					System.out.println("Registration Succesfull");
					msg="<h2>Registered</h2>";
				}
				else {
					System.out.println("Registration failed");
					msg="<h2>Registration Failed</h2>";
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}

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
