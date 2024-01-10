package com.oops;

public class Lab301 {

	public static void main(String[] args) {
		methoverload5 m=new methoverload5();
		byte b=5;
		m.sum(b, 10);
		m.sum(b, b);
	}

}
class methoverload5{
	void sum(byte a,int b) {
		System.out.println("sum(byte,int)");
	}
}