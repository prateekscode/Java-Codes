package com.mvc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mvc.dao.LoginDao;
import com.mvc.dto.LoginDTO;

public class LoginDaoImpl implements LoginDao{

	@Override
	public String loginUser(LoginDTO loginDTO) {
		
		String dbPwd="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","prateek");
			String sql="select password from register where username=?";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, loginDTO.getUsername());
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				dbPwd=rs.getString("password");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return dbPwd;
	}

	

}
