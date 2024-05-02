package com.practice;

public class FuncInter2 {
	public static void main(String[] args) {

		A a = () -> System.out.println("Hey!");
		a.m1();
		
		B b=()->System.out.println("Hii from B");
		b.m1();
	}
}

@FunctionalInterface
interface A {
	void m1();
}

@FunctionalInterface
interface B extends A{
	void m1();
}