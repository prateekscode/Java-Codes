package com.assigncastref;

public class Lab429 {

	public static void main(String[] args) {
		A aobj=new D();
		B bobj=new B();
		C cobj=new C();
		D dobj=new D();
		System.out.println(aobj==dobj);
		System.out.println(aobj==bobj);
		System.out.println(aobj==cobj);
	}

}
