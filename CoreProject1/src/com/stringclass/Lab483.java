package com.stringclass;

public class Lab483 {

	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str);
		
		char chArr[]=str.toCharArray();
		
		for(char ch:chArr) {
			System.out.println(ch);
			}
		byte byArr[]=str.getBytes();
		for(byte by:byArr) {
			System.out.println(by);
		}
		for(byte by:byArr) {
			char ch1=(char)by;
			System.out.println(ch1);
		}
	}

}
