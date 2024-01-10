package com.oops;

public class Lab227a {

	public static void main(String[] args) {
		Test7 t=new Test7();
		Test7 t2=new Test7();
		System.out.println(t.c+"\t"+t2.c);
		t2.c=50;
		System.out.println(t.c+"\t"+t2.c);
	}

}
class Test7{
	int c;
}