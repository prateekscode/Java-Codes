package com.oops;

public class Lab284 {

	public static void main(String[] args) {
		Methre5 m=new Methre5();
//		The method println(boolean) in the type PrintStream is not applicable for the arguments (void)
//		System.out.println(m.show(10));
	}

}
class Methre5{
	void show(int x) {
		System.out.println("Show()");
	}
}