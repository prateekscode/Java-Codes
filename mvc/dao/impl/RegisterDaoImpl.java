package com.mvc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mvc.dao.RegisterDao;
import com.mvc.dto.RegisterDTO;

public class RegisterDaoImpl implements RegisterDao{

	@Override
	public int registerUser(RegisterDTO registerDTO) {
		
		int result=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "prateek");
			String sql = "insert into register values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, registerDTO.getFullName());
			ps.setString(2, registerDTO.getUserName());
			ps.setString(3, registerDTO.getPassword());
			ps.setString(4, registerDTO.getCpassword());
			ps.setString(5, registerDTO.getEmail());
			ps.setString(6, registerDTO.getPhone());
			ps.setString(7, registerDTO.getGender());
			ps.setString(8, registerDTO.getCourses());
			ps.setString(9, registerDTO.getTimings());
			ps.setString(10, registerDTO.getRemarks());
			
			result=ps.executeUpdate();
			
			if(result==1) {
				System.out.println("Registration Succesfull");
//				msg="<h2>Registered</h2>";
			}
			else {
				System.out.println("Registration failed");
//				msg="<h2>Registration Failed</h2>";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
