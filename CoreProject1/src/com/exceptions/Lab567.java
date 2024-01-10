package com.exceptions;

public class Lab567 {

	public static void main(String[] args) {
		try {
//			Exception in thread "main" java.lang.ArithmeticException: / by zero
			int r=10/0;
		}
/*		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		SQLException cannot be resolved to a type
*/		
		catch(SQLException e){
			System.out.println("Something went wrong");
		}
	}

}
