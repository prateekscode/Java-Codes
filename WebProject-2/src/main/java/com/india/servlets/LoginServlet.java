package com.india.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String password = req.getParameter("pwd");
		System.out.println("Given username and password: " + name + "\t" + password);
		String msg = "";
		if (name.equals(password)) {
			msg = "<h1>Login Succesful<br/>Welcome. Thanks for using me.";
		} else {
			msg = "<h1>Login Failed.</h1>";
		}

		Writer out = resp.getWriter();
		out.write(msg);
	}

}
