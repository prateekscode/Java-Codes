package com.stringclass;

public class Lab487 {

	public static void main(String[] args) {
		String str="Hello Guys Hi Guys How are you doing";
		System.out.println(str);
		System.out.println(str.length());
		String strArr1[]=str.split("");
		System.out.println(strArr1.length);
		
		for(String x:strArr1) {
			System.out.println(x);
		}
		
		String strArr2[]=str.split("",5);
		System.out.println(strArr2.length);
		
		for(String x:strArr2) {
			System.out.println(x);
		}
		
		String strArr3[]=str.split("Guys");
		System.out.println(strArr3.length);
		for(String x:strArr3) {
			System.out.println(x+"\t"+x.length());
		}
	}

}
