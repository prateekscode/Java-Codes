package com.accessmodifier;
public class A{
	private int a=10;
	int b=80;
	protected int c=65;
	public int d=40;
	public void showA() {
		System.out.println("show--A");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}