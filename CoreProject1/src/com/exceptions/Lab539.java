package com.exceptions;

public class Lab539 {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		try {
			String str=args[0];
			int x=Integer.parseInt(str);
			int re=20/x;
			System.out.println("Result="+re);
		}catch(Throwable e) {
			System.out.println("Please provide correct value");
		}
	}

}
