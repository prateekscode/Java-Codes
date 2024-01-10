package com.jdbc;
import java.sql.*;

public class Lab2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","prateek");
		String query="insert into student values(104,'prateek','prateek@mail.com','Male',784512963)";
		Statement st=con.createStatement();
		int rs=st.executeUpdate(query);
		System.out.println("Result--"+rs);
		con.close();
		st.close();
		
	}

}
