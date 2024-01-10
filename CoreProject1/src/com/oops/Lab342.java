package com.oops;

public class Lab342 {

	public static void main(String[] args) {
		N8 l=new N8();
		l.display();
	}

}
class Sup1{
	static int a=5;
}
class N8 extends Sup1{
	static int a=90;
	void display() {
		int a=33;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}