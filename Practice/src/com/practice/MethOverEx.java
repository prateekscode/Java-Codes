package com.practice;

public class MethOverEx {
	public static void main(String[] args) {
		Ex2 e=new Ex2();
		e.m1(2, 4);

	}
}

class Ex1 {
	void m1(int a, int b) {

		System.out.println(a + b);
	}

}

class Ex2 extends Ex1 {
	void m1(int a, int b) {
		System.out.println(a * b);
	}
}
