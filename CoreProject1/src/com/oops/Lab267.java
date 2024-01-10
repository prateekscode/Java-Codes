package com.oops;

public class Lab267 {

	public static void main(String[] args) {
		cons7 c=new cons7();
		c.show();
	}

}
class cons7{
	int a=99;
	void show() {
		String a="Hello!";
		System.out.println(a);
		System.out.println(this.a);
	}
}