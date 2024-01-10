package com.oops;

public class Lab297 {
	public static void main(String[] args) {
		methoverload1 m=new methoverload1();
		System.out.println(m.sum(30,40));
		System.out.println(m.sum(30,40,30));
	}
}
class methoverload1{
	int sum(int a,int b) {
		System.out.println("sum(int,int)");
		return a+b;
	}
	int sum(int a,int b,int c) {
		System.out.println("Sum(int,int,int)");
		return a+b+c;
	}
}