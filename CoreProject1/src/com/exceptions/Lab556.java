package com.exceptions;

public class Lab556 {

	public static void main(String[] args) {
		System.out.println("Main started.");
		
		try {
			int re=10/3;
			System.out.println("Result:"+re);
			return;
		}
		catch(NumberFormatException e) {
			System.out.println("Please provide value");
		}
		finally {
		System.out.println("Hello!");
		System.out.println("Ok");
		}
		System.out.println("main end");
	}

}
