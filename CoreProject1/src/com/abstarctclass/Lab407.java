package com.abstarctclass;

abstract class Hello{
	static int a=1233;
	static void show() {
		System.out.println("Hello--show");
	}
}
public class Lab407 {

	public static void main(String[] args) {
		System.out.println(Hello.a);
		Hello.show();
	}

}
