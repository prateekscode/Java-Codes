package com.oops;

public class Lab253 {

	public static void main(String[] args) {
		System.out.println(Test24.c);

	}

}
class Test24{
	static int c;
	static{
		final int a=30;
		System.out.println(c);
		System.out.println(a);
	}
}