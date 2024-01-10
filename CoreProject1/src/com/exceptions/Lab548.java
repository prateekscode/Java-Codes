package com.exceptions;

public class Lab548 {

	public static void main(String[] args) {
		System.out.println("Main starts--");
		System.out.println("1--------------");
		
		String str="";
		
		try {
			str=args[0];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide value.");
		}
		
		System.out.println("2---------------");
		
		int x=0;
		try {
			x=Integer.parseInt(str);
		}catch(NumberFormatException e) {
			System.out.println("Hii! Provide some integer value only.");
		}
		
		System.out.println("3----------------");
		
		try {
			int res=30/x;
			System.out.println("Result:"+res);
		}
		catch(ArithmeticException e) {
			System.out.println("Provide correct input.");
		}
		System.out.println("Main ended");
	}

}
