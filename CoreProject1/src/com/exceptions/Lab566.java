package com.exceptions;

public class Lab566 {

	public static void main(String[] args) {
		try {
//			Exception in thread "main" java.lang.ArithmeticException: / by zero
			int r=10/0;
		}
		catch(NumberFormatException e){
			System.out.println("Something went wrong");
		}
	}

}
