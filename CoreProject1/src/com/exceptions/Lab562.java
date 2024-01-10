package com.exceptions;

class Ex5{
	void m3() {
		System.out.println("m3() started");
		int x=10/0;
		System.out.println("m3() ends");
	}
}
class Ex6{
	void m2() {
		System.out.println("m2() started");
		new Ex5().m3();
		System.out.println("M2() ends");
	}
}
class Ex7{
	void m1() {
		System.out.println("m1() started");
		new Ex6().m2();
		System.out.println("M1() ends.");
	}
}

class Excep{
	void show() {
		System.out.println("Show started");
		new Ex7().m1();
		System.out.println("Show ends()");
	}
}

public class Lab562 {

	public static void main(String[] args) {
		System.out.println("main started");
		try {
			new Excep().show();
		}
		catch(Exception e) {
			System.out.println("\ncatch block");
			System.out.println("Ex:"+e);
			System.out.println("Message:"+e.getMessage());
			System.out.println("Cause:"+e.getCause());
			System.out.println();
			e.printStackTrace();
			}
			System.out.println("main end.");
		}
		
	}
