package com.exceptions;

public class Lab551 {

	public static void main(String[] args) {
		
		try {
			int a=10/0;
			System.out.println("Result:"+a);
		}
//		The exception ArithmeticException is already caught by the alternative ArithmeticException.
		catch(ArithmeticException |ArithmeticException ex) {
			System.out.println("Please provide the value.");
		}
	}

}
