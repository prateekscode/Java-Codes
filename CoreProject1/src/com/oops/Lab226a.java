package com.oops;

public class Lab226a {

	public static void main(String[] args) {
		Test6 t=new Test6();
		System.out.println(t.c);
		t.c=85;
		System.out.println(t.c);
	}

}
class Test6{
	int c;
}