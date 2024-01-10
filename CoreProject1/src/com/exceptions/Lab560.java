package com.exceptions;

class Ex4{
	void show(String str) {
		int a=0;
		try {
			System.out.println("try started.");
			int x=Integer.parseInt(str);
			a=10/x;
			System.out.println("try end");
		}
		catch(Exception e) {
			System.out.println("catch block");
			System.exit(0);
		}
		finally {
			System.out.println("finally block.");
		}
	}
}
public class Lab560 {

	public static void main(String[] args) {
		System.out.println("Main started");
		Ex4 e=new Ex4();
		e.show("0");
		System.out.println("main end");
	}

}
