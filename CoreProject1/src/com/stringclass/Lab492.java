package com.stringclass;

public class Lab492 {

	public static void main(String[] args) {
		String str1="[A-za-z]*";
		
		System.out.println("Sri".matches(str1));
		System.out.println("John Alter".matches(str1));
		System.out.println("Jo hn Al ter".matches(str1));
		
		System.out.println("!!!!!!!!!!!!");
	}
}