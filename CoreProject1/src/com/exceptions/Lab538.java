package com.exceptions;

public class Lab538 {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		try {
			String str=args[0];
			int x=Integer.parseInt(str);
			int r=10/x;
			System.out.println("Result:"+r);
		}catch(Throwable e) {
			System.out.println("Main end");
		}

	}

}
