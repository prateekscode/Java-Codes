package com.jdbc;
import java.sql.*;

public class SqlConnection {
	
	static Connection getMysqlConnection() {
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","prateek");
			return con;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}
	static void close(Connection con,Statement st ) {
		try {
			if(con!=null)
				con.close();
			if(st!=null)
				st.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void close(Connection con,Statement st,ResultSet rs) {
		try {
			if(con!=null)
				con.close();
			if(st!=null)
				st.close();
			if(rs!=null)
				rs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
