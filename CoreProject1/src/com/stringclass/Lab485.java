package com.stringclass;

public class Lab485 {

	public static void main(String[] args) {
		String str="Hii Hello Guys";
		System.out.println(str);
		
		byte byArr[]=new byte[str.length()];
		byArr[0]=90;
		str.getBytes(0,10,byArr,1);
		
		for(byte by:byArr) {
			System.out.println(by);
		}
	}

}
