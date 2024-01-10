package com.jdbc;
import java.sql.*;	
import java.util.Scanner;
public class Lab11 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter eid");
			 int eid=sc.nextInt();
			 System.out.println("Enter Ename");
			 String ename=sc.next();
			 System.out.println("Enter Emob");
			 int emob=sc.nextInt();
			 
			 con=SqlConnection.getMysqlConnection();
			 String query="insert into emp values(?,?,?)";
			 pst=con.prepareStatement(query);
			 pst.setInt(1, eid);
			 pst.setString(2, ename);
			 pst.setInt(3, emob);
			 
			 int res=pst.executeUpdate();
			 System.out.println("Result: "+res);
			 
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			SqlConnection.close(con, pst, rs);
		}
	}

}
