package com.javalearn;

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

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("uname");
		String password=req.getParameter("pwd");
		System.out.println("Given username and password: "+uname+"\t"+password);
		String msg="";
		String dbpwd="";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "prateek");
			String sql="Select password from register where username=?";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, uname);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				dbpwd=rs.getString("password");
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
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