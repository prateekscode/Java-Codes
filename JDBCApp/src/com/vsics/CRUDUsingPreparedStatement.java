package com.vsics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUDUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Enter name,amount to enter");
		Scanner sc=new Scanner(System.in);
//		int id=sc.nextInt();
		String name=sc.next();
		float amount=sc.nextFloat();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bank","bank123");
		
		//customerid is the name of sequence in the sql use for autogeneration of customer id. 
		//query of sql ->create sequence customerid start with 1001;
		//nextVal is the method of sequence.
		String query="insert into customerjdbc values(customerid.nextVal,?,?)";
		
		PreparedStatement ps=con.prepareStatement(query);
		//set the value to ps object.
//		ps.setInt(1, id);
		ps.setString(1,name);
		ps.setFloat(2, amount);
		
		//send and execute 
		int result=ps.executeUpdate();
		if(result==0) {
			System.out.println("record not inserted");
		}
		else {
			System.out.println("record inserted successfully.");
		}
		//closing the connection
		ps.close();
		con.close();
		sc.close();
		
	}

}
