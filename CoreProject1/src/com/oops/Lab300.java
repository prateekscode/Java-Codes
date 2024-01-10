package com.oops;

public class Lab300 {

	public static void main(String[] args) {
		methoverload4 m=new methoverload4();
		byte b=15;
		m.sum(10, b);
//		The method add(byte, byte) is undefined for the type methoverload4.
//		m.add(b,b);
	}

}
class methoverload4{
	void sum(int a,byte b) {
		System.out.println("sum(int,byte)");
	}
}