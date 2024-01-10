package com.exceptions;

class Ex3 {
	void show(String str) {
		int a = 0;

		try {
			System.out.println("try stared:" + a);
			int x = Integer.parseInt(str);
			a = 10 / x;
			System.out.println("try end:" + a);
			System.exit(0);
		} catch (ArithmeticException e) {
			System.out.println("catch block:" + a);
		} finally {
			System.out.println("finally:" + a);
		}
	}
}

public class Lab559 {

	public static void main(String[] args) {

		System.out.println("main started");
		Ex3 e=new Ex3();
		e.show("10");
		System.out.println("main ended");
	}

}
