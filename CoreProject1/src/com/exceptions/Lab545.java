package com.exceptions;

public class Lab545 {

	public static void main(String[] args) {
		System.out.println("Main started\n");
		
		try {
//			java.lang.ArithmeticException: / by zero
			int a=10/0;
			System.out.println("Result:"+a);
		}
		catch(NumberFormatException e) {
			System.out.println("Provide correct value.");
		}
		System.out.println("Main ended.");
	}

}
