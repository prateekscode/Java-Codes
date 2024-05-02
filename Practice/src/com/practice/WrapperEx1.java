package com.practice;

public class WrapperEx1 {

	public static void main(String[] args) {
		int a= 54;
		Integer i=a;
		System.out.println(i);
		
		Integer q=12;
		int w=q;
		System.out.println(w);
		
		Float f=1.2f;
		Float g=1.2f;
		System.out.println(f.equals(g));	//compare the content
		
		Boolean b=true;
		System.out.println(b.hashCode());	//1231 for true
		Boolean b1=false;
		System.out.println(b1.hashCode());	//1237 for false
		
		Character n='A';
		System.out.println(n.hashCode());	//returns ASCII value of character
		
		//hashCode() method of Byte,Short,Integer and Long returns content of object.
		//All wrapper classes are comparable
		
	}

}
