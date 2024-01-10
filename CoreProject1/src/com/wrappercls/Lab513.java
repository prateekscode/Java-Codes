package com.wrappercls;

public class Lab513 {
	public static void main(String[] args) {
		
	Byte b1=123;
	Byte b2=123;
	System.out.println(b1==b2);
	
	Byte b=123;
	Byte b3=new Byte(b);
	Byte b4=new Byte(b);
	System.out.println(b3==b4);
	}
}
