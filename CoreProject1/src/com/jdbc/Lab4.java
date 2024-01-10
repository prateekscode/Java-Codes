package com.jdbc;
import java.sql.*;
public class Lab4 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","prateek");
			String query="insert into emp values(1006,'Abhilash',33221144)";
			st=con.createStatement();
			int rs=st.executeUpdate(query);
			System.out.println("Result:"+rs);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally {
			try {
				if(con!=null)
					con.close();
				if(st!=null)
					st.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
