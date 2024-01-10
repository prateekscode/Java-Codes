package com.jdbc;
import java.sql.*;
public class Lab3 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "prateek");
			st=con.createStatement();
			String query="create table emp(eid int primary key,ename varchar(30),emob int)";
			int rs=st.executeUpdate(query);
			System.out.println("Result:"+rs);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null)
					con.close();
				if(st!=null)
					st.close();
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}

}
