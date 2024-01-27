package com.mvc.controller;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.dto.LoginDTO;
import com.mvc.service.LoginService;
import com.mvc.service.impl.LoginServiceImpl;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	
	private LoginService loginService;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		loginService=new LoginServiceImpl();
		
		String uname=req.getParameter("uname");
		String password=req.getParameter("pwd");
		System.out.println("Given username and password: "+uname+"\t"+password);
		String msg="";
		String dbpwd="";
		
		LoginDTO loginDTO=new LoginDTO();
		loginDTO.setUsername(uname);
		loginDTO.setPwd(password);
		
		dbpwd=loginService.loginUser(loginDTO);
		
		if(dbpwd.equals(password)) {
			msg="<h2>Login Successful.</br>Welcome "+uname+",Thanks for visiting</h2>";
		}
		else {
			msg="<h1>Login Failed</h1>";
		}
		
		Writer out=resp.getWriter();
		out.write(msg);
		out.write("<br/>");
		out.write("<br/>");
		
		RequestDispatcher rd=req.getRequestDispatcher("/Home.html");
		rd.include(req, resp);
	}
}