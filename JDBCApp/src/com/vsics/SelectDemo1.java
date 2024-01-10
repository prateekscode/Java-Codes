package com.vsics;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);

		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Create the connection Object
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bank","bank123");
		System.out.println("Class name:"+con.getClass().getName());
		
		//Create the statement object
		Statement st=con.createStatement();
		System.out.println("Class Name:"+st.getClass().getName());
		System.out.println();
		
		System.out.println("The following records given in the table:----");
		
		//Prepare the sql query
		String QUERY="select empno,ename,job,sal from emp";
		
		//send and execute the sql query 
		ResultSet rs=st.executeQuery(QUERY);
		
		while(rs.next()!=false) {
			System.out.println("Employee id: "+rs.getInt(1));
			System.out.println("Employee Name: "+rs.getString(2));
			System.out.println("Employee Job: "+rs.getString(3));
			System.out.println("Employee Salary: "+rs.getDouble(4));
			System.out.println();
		}
		
		System.out.println("Enter the operation you want to perform:-");
		System.out.println("1.Insert\n"+"2.Update\n"+"3.Delete");
		System.out.println("Enter the number accordingly!");
		int x=sc.nextInt();

		switch(x) {
		
		case 1:
			
		System.out.println("Please enter the data to enter in table:-");
		int eno1=sc.nextInt();
		String en1=sc.next();
		String job1=sc.next();
		float sal1=sc.nextFloat();
		
		//insertion sql query
		String QUERY2="insert into emp(empno,ename,job,sal)values("+eno1+","+"'"+en1+"'"+","+"'"+job1+"'"+","+sal1+")";
		
//     	System.out.println(QUERY2);
		int a1=st.executeUpdate(QUERY2);
		if(a1==0) {
			System.out.println("Record not inserted "+eno1);
		}
		else {
			System.out.println("Record inserted "+eno1);
		}
		break;
		
		case 2:
			System.out.println("Please enter the employee number to modify---");
			int eno3=sc.nextInt();
			System.out.println("Now enter the new data--name,job,salary");
			String enamea=sc.next();
			String joba=sc.next();
			float sala=sc.nextFloat();
			
			//Updation query in sql
			String Query3="update emp set ename="+"'"+enamea+"'"+","+"job="+"'"+joba+"'"+","+"sal="+sala+" "+"where empno="+eno3+";";		
			
			System.out.println(Query3);
			
			int c=st.executeUpdate(Query3);
			if(c==0) {
				System.out.println("Record not updated ");
			}
			else {
				System.out.println("Record Updated ");
			}
			break;
			
		case 3:
			
		System.out.println("Please enter employee number to delete the record");
		int eno=sc.nextInt();
		
		//deletion sql query
		String QUERY1="delete from emp where empno="+eno;
		
		int a=st.executeUpdate(QUERY1);
		if(a==0) {
			System.out.println("Record not deleted for "+eno);
		}
		else {
			System.out.println("Record deleted for "+eno);
		}
		
		}
				
	}

}
