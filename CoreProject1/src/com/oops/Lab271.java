package com.oops;

public class Lab271 {

	public static void main(String[] args) {
		cons11 c=new cons11(88);
		c.show();
	}

}
class cons11{
	int a;
	cons11(){
		System.out.println("Hello folks");
	}
	cons11(int a){
		this();
		System.out.println("1 parameter constructor");
		this.a=a;
	}
	void show() {
		System.out.println(a);
	}
}