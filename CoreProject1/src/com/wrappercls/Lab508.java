package com.wrappercls;

public class Lab508 {

	public static void main(String[] args) {
//		java.lang.NumberFormatException.
		String str1="123A";
		
		int x=Integer.parseInt(str1);
		System.out.println(x);
		
		Integer i1=new Integer(str1);
		System.out.println(i1);
	}

}
