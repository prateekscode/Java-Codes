package com.stringclass;

public class Lab477 {

	public static void main(String[] args) {
		String str="Hello Man! How you going?";
		System.out.println(str);
		String str1=str.replace("H", "B");
		System.out.println(str1);
		
		String str2=str.replace("H", "N");
		System.out.println(str2);
		
		String str3=str.replace("you", "u");
		System.out.println(str3);
		
		String str4=str.replace("u", "you");
		System.out.println(str4);
		System.out.println(str4=str);
		
		String str5=str.replaceFirst("o", "TTT");
		System.out.println(str5);
		
		String str6=str.replaceAll("o", "KKK");
		System.out.println(str6);
	}

}
