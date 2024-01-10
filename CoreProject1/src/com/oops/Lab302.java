package com.oops;

public class Lab302 {

	public static void main(String[] args) {
		methoverload6 m=new methoverload6();
		byte b=25;
		m.sum(b, 30);
		m.sum(30,b);
	}

}
class methoverload6{
	void sum(byte a,int b) {
		System.out.println("sum(byte,int)");
	}
	void sum(int a,byte b) {
		System.out.println("sum(int,byte)");
	}
}