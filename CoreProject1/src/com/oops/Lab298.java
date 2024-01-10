package com.oops;

public class Lab298 {

	public static void main(String[] args) {
		methoverload2 m=new methoverload2();
		System.out.println(m.sum(50, 80));
		System.out.println(m.sum("Hello!", 80));
	}

}
class methoverload2{
	int sum(int a,int b) {
		System.out.println("sum(int,int)");
		return a+b;
	}
	String sum(String a,int b) {
		System.out.println("sum(String,int)");
		return a+b;
	}
}