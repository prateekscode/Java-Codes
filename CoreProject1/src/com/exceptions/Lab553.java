package com.exceptions;

public class Lab553 {

	public static void main(String[] args) {
		System.out.println("Main started.\n");
		
		try {
			int res=10/0;
			System.out.println("Result:"+res);
		}
		catch(NumberFormatException e) {
			System.out.println("Please provide the value.");
		}
		System.out.println("Hello!");
		System.out.println("Ok");
		
		System.out.println("Main end.");
	}

}
