package com.oops;

public class Lab277 {

	public static void main(String[] args) {
		Meth4.show();
	}

}
class Meth4{
	int m;
	static int n;
	static void show() {
//		Cannot make a static reference to the non-static field m.
//		System.out.println(m);
		System.out.println(n);
	}
}