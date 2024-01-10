package com.wrappercls;

class W3{
	void show(Byte a,Byte b) {
		System.out.println("3.show(Byte,Byte)");
	}
	void show(byte...a) {
		System.out.println("4.show(byte...)");
	}
}
public class Lab524 {

	public static void main(String[] args) {
		W3 w=new W3();
		byte b1=10;
		byte b2=20;
		w.show(b1,b2);
		
	}

}
