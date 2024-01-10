package com.wrappercls;

class W2{
	void show(int a,int b) {
		System.out.println("show(int,int)");
	}
	void show(Byte a,Byte b) {
		System.out.println("Show(byte,byte");
	}
	void show(byte...a) {
		System.out.println("show(byte...)");
	}
	
}
public class Lab523 {

	public static void main(String[] args) {
	W2 w=new W2();
	byte b1=10;
	byte b2=20;
	w.show(b1,b2);
	}

}
