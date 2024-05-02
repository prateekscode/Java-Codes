package com.practice;


public class FuncInter {
	public static void main(String[] args) {
		r1 r=()->System.out.println("Hey");
		r.get();
	}
}

@FunctionalInterface
interface r1{
	void get();
}

interface r2 extends r1{
	void get2();
}