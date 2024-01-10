package com.wrappercls;

class W1{
	void show(int a,int b) {
		System.out.println("show(int,int)//1");
	}
	void show(byte a,byte b) {
		System.out.println("show(byte,byte)//2");
	}
	void show(Byte a,Byte b) {
		System.out.println("show(Byte,Byte)//3");
	}
	void show(byte...a) {
		System.out.println("show(byte...a)//4");
	}
}
public class Lab522 {

	public static void main(String[] args) {
		W1 w=new W1();
		byte b1=10;
		byte b2=20;
		w.show();
		w.show(b1);
		w.show(b1, b2);
	}

}
