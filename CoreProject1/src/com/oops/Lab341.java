package com.oops;

public class Lab341 {
	public static void main(String[] args) {
		N7 n=new N7();
		n.show();
	}
}
class Sup{
int a=30;	
}
class N7 extends Sup{
	int a=21;
	void show() {
		int a=99;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}