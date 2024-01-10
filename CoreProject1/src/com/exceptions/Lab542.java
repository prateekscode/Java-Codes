package com.exceptions;

public class Lab542 {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		try {
			String str=args[0];
			int x=Integer.parseInt(str);
			int re=20/x;
			System.out.println("Result="+re);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide correct value");
		}
		catch(NumberFormatException e) {
			System.out.println("Please provide only integer value");
		}
		catch(Exception e) {
			System.out.println("Please provide correct value");
		}
		
		System.out.println("Main ended");
	}

}
