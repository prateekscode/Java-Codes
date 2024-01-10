package com.abstarctclass;

abstract class Hello1{
	int a;
	Hello1(int a){
		this.a=a;
		System.out.println("Hello int cons");
	}
	{
		System.out.println("Hello Instance block");
	}
	void show() {
		System.out.println("Hello1 show");
	}
}
class Hii extends Hello1{
Hii(int a){
	super(a);
}
}
public class Lab408{
	public static void main(String[] args) {
	Hii h=new Hii(90);
	h.show();
	}
}
