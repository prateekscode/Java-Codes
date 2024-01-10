package com.assigncastref;

public class Lab430 {

	public static void main(String[] args) {
		A aobj=new D();
		E eobj=new E();
//		Type mismatch: cannot convert from E to A
//		System.out.println(aobj=eobj);
		B bobj=new B();
		C cobj=new C();
		System.out.println(aobj==cobj);
	}

}
