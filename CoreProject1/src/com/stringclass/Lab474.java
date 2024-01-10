package com.stringclass;

public class Lab474 {

	public static void main(String[] args) {
		String str1="Get back";
		boolean b1=str1.startsWith("Get");
		System.out.println(b1);
		b1=str1.startsWith("Got");
		System.out.println(b1);
		b1=str1.startsWith("back");
		System.err.println(b1);
		b1=str1.startsWith("back",6);
		System.out.println(b1);
	}

}
