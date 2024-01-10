package com.oops;

public class Lab311 {

	public static void main(String[] args) {
		Varargs1 v=new Varargs1();
		v.add(50, 50);
		v.add(25, 25, 25);
	}

}
class Varargs1{
	void add(int a,int b) {
		System.out.println("add(int,int)");
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println("add(int,int,int)");
		System.out.println(a+b+c);
	}
}