package com.oops;

public class Lab276 {

	public static void main(String[] args) {
		meth3 m=new meth3();
		m.show();
	}

}
class meth3{
	int a;
	static int b;
	void show() {
		System.out.println(a);
		System.out.println(b);
	}
}