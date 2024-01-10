package com.stringclass;

public class Lab479 {

	public static void main(String[] args) {
		String str="GoodMorning";
		System.out.println(str);
		
		int x=str.lastIndexOf('o');
		System.out.println(x);
		
		x=str.lastIndexOf('G',7);
		System.out.println(x);
		
		x=str.lastIndexOf('r');
		System.out.println(x);
		
		x=str.lastIndexOf('R');
		System.out.println(x);
		
		String mstr="New day Newer day";
		int y=mstr.lastIndexOf("day");
		System.out.println(y);
		
		y=mstr.lastIndexOf("day",7);
		System.out.println(y);
		
		y=mstr.lastIndexOf("Ne");
		System.out.println(y);
		
		y=mstr.indexOf("Ha",5);
		System.err.println(y);
	}

}
