package com.wrappercls;

class W4{
	void show(byte...a) {
		System.out.println("show(byte...a)");
	}
}
public class Lab525 {

	public static void main(String[] args) {
		W4 w=new W4();
		byte b1=10;
		byte b2=20;
		w.show(b1,b2);
	}

}
