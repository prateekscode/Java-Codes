package com.exceptions;

public class Lab561 {

	public static void main(String[] args) {
		System.out.println("Main started");
//		java.lang.NegativeArraySizeException
//		int arr[]=new int[-4];
		
		try {
			System.out.println("try block");
			int a=10/10;
		}
		catch(NumberFormatException e) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("main end");
	}

}
