package com.oops;

public class Lab310 {

	public static void main(String[] args) {
		Varargs v=new Varargs();
		v.sum(55, 25);
	}

}
class Varargs{
	void sum(int a,int b) {
		System.out.println("sum(int,int)");
		System.out.println(a+b);
	}
}