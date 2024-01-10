package com.jdbc;

import java.sql.*;

public class Lab9 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = SqlConnection.getMysqlConnection();
			String query = "select * from emp";
			st = con.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println("Eid: " + rs.getInt("eid"));
				System.out.println("Ename: " + rs.getString("ename"));
				System.out.println("Emob: " + rs.getInt("emob"));
				System.out.println();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			SqlConnection.close(con, st, rs);
		}
	}

}
