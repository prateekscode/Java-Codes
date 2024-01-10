package com.jdbc;
import java.sql.*;
public class Lab1 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","prateek");
			String sqlquery="delete from student where sid=104";
			st=con.createStatement();
			int res=st.executeUpdate(sqlquery);
			if(res==1) {
				System.out.println("Record added");
			}else {
				System.out.println("Record not inserted.");
			}
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
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("JDBC run succesfully");
	}

}
