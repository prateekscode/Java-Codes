package com.finalizemeth;

class Cls1{
	public void finalize() {
		System.out.println("Cls1-finalize()");
	}
}
class Cls2{
	void show() {
		System.out.println("show()");
	}
	void m1() {
	System.out.println("m1-started");
	Cls1 c1=new Cls1();
	Cls1 c2=new Cls1();
	Cls1 c3=new Cls1();
	}
	public void finalize() {
		System.out.println("Cls2-finalize()");
	}
}

public class Lab456 {

	public static void main(String[] args) {
		new Cls2().show();
		Cls2 cc=new Cls2();
		cc=null;
		Cls2 cc1=new Cls2();
		Cls2 cc2=new Cls2();
		cc1=cc2;
		new Cls2().m1();
		System.runFinalization();
		System.gc();
	}

}
