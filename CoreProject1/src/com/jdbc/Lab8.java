package com.jdbc;
import java.sql.*;
public class Lab8 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			con=SqlConnection.getMysqlConnection();
			String query="insert into emp values(1007,'Edward',45646546)";
			st=con.createStatement();
			int rs=st.executeUpdate(query);
			System.out.println("Result :"+rs);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			SqlConnection.close(con, st);
		}
	}

}
