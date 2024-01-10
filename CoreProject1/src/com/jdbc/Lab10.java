package com.jdbc;
import java.sql.*;
public class Lab10 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			con=SqlConnection.getMysqlConnection();
			String query="Select * from emp where ename=? and eid=?";
			pst=con.prepareStatement(query);
			pst.setString(1, "Rohan");
			pst.setInt(2, 1001);
			
			rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println("Eid: "+rs.getInt(1));
				System.out.println("Ename: "+rs.getString(2));
				System.out.println("Emob: "+rs.getInt(3));
				
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			SqlConnection.close(con, pst, rs);
		}
	}

}
