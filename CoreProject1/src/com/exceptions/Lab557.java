package com.exceptions;

class Ex1{
	int show() {
		int a=0;
		
		try {
			System.out.println("try started.");
			a=10/3;
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
//		 java.lang.NegativeArraySizeException
//		int ar[]=new int[-1];
		}
	}
}
public class Lab557 {

	public static void main(String[] args) {
		System.out.println("main started.");
		Ex1 e=new Ex1();
		int b=e.show();
		System.out.println("B="+b);
		System.out.println("main ended.");
	}

}
