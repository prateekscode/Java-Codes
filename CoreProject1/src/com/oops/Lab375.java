package com.oops;

public class Lab375 {

	public static void main(String[] args) {
		P4 pobj=new P4();
		pobj.show(55);
		pobj.show("Namaste");
	}

}
class P3{
	void show(int a) {
		System.out.println("P3-show(int)");
	}
}
class P4 extends P3{
	void show(String a) {
		System.out.println("P4-show(String)");
	}
}