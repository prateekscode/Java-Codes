package com.stringclass;

public class Lab475 {

	public static void main(String[] args) {
		String str1="Get back";
		boolean b1=str1.endsWith("Get");
		System.out.println(b1);
		b1=str1.endsWith("back");
		System.out.println(b1);
		b1=str1.endsWith("ck");
		System.err.println(b1);
		b1=str1.endsWith("ba");
		System.out.println(b1);
	}

}