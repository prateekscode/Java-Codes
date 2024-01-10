package com.assigncastref;

public class Lab422 {

	public static void main(String[] args) {
		D obj=new D();
		A obj1=obj;
//		Type mismatch: cannot convert from A to B
		B obj3=obj1;
//		Type mismatch: cannot convert from A to D
		D obj4=obj1;
	}

}
