package com.stringclass;

public class Lab478 {

	public static void main(String[] args) {
		String str="GoodMorning";
		System.out.println(str);
		
		int x=str.indexOf('M');
		System.out.println(x);
		
		x=str.indexOf('G',7);
		System.out.println(x);
		
		x=str.indexOf('r');
		System.out.println(x);
		
		String mstr="Have a nice day";
		int y=mstr.indexOf("nice");
		System.out.println(y);
		
		y=mstr.indexOf("day",7);
		System.out.println(y);
		
		y=mstr.indexOf("Ha");
		System.out.println(y);
		
		y=mstr.indexOf("Ha",5);
		System.err.println(y);
	}

}
