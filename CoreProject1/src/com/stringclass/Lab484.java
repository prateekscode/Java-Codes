package com.stringclass;

public class Lab484 {

	public static void main(String[] args) {
		String str="Hii Hello Guys";
		System.out.println(str);
		
		char chArr[]=new char[str.length()];
		chArr[0]='Z';
		str.getChars(0,10,chArr,1);
		
		for(char ch:chArr) {
			System.out.println(ch);
		}
		char chArr1[]=new char[5];
		str.getChars(3, 8, chArr1, 0);
		
		for(char ch1:chArr1) {
			System.out.println(ch1);
		}
	}

}
