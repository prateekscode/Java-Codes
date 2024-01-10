package com.exceptions;

public class Lab552 {

	public static void main(String[] args) {
		
		try {
			int a=10/0;
			System.out.println("Result:"+a);
		}
//		The exception ArithmeticException is already caught by the alternative Exception.
		catch(ArithmeticException |Exception ex) {
			System.out.println("Please provide the value.");
		}
	}

}
