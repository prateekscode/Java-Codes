package com.stringclass;

public class Lab464 {

	public static void main(String[] args) {
		String str1="Incredible!";
		String str2="India";
		String str3=str1.concat(str2);
		System.out.println(str3);
		String str4="Incredible!India";
		System.out.println(str4);
		System.out.println(str3==str4);
		String str5="Incredible!".concat("India");
		System.out.println(str4==str5);
	}

}
