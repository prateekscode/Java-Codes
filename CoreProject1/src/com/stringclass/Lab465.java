package com.stringclass;

public class Lab465 {

	public static void main(String[] args) {
		String str1=new String("India");
		String str2=new String("India");
		String str3=new String("Bharat");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		boolean b1=str1.equals(str2);
		System.out.println(b1);
		
		boolean b2=str1.equals(str3);
		System.out.println(b2);
	}

}
