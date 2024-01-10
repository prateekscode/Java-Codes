package com.exceptions;

class Ex2{
	int show(String str) {
		int a=0;
		
		try { 
			System.out.println("try started.");
			int x=Integer.parseInt(str);
			a=30/x;
			System.out.println("try end.");
			return a;
		}
		catch(ArithmeticException e) {
			a=20;
			System.out.println("catch block");
			return a;
		}
		finally {
		System.out.println("finally block.");
		}
	}
}
public class Lab558 {

	public static void main(String[] args) {
		System.out.println("main started.");
		Ex2 e=new Ex2();
//		int res=e.show("10");
//		java.lang.NumberFormatException
//		int res=e.show("abc");
		int res=e.show("0");
		System.out.println("Result="+res);
		System.out.println("main ended.");
	}

}
