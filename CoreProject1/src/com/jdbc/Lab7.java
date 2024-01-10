package com.jdbc;
import java.sql.*;

public class Lab7 {
	
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","prateek");
			String query="select * from emp";
			st=con.createStatement();
			rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println("Eid: "+rs.getInt("eid"));
				System.out.println("Ename: "+rs.getString("ename"));
				System.out.println("Emob: "+rs.getInt("emob"));
				System.out.println();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
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
}
