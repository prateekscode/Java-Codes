package com.oops;

public class Lab303 {

	public static void main(String[] args) {
		methoverload7 m=new methoverload7();
		byte b=23;
//		The method sum(byte, int) is ambiguous for the type methoverload7
//		m.sum(b, b);
		m.sum(b, 35);
		m.sum(35, b);
	}

}
class methoverload7{
	void sum(byte a,int b) {
	System.out.println("sum(int,byte)");
	}
	void sum(int a,byte b) {
		System.out.println("sum(int,byte)");
	}
}