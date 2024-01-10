package com.accessmodifier2;
import com.accessmodifier.Hello;
	class Xyz extends Hello{}
	class Hii extends Hello{
		void show() {
			System.out.println("Hii show");
//			Hello h=new Hello();
//			The field Hello.ab is not visible
//			System.out.println(h.ab);
//			Xyz x=new Xyz();
//			The field Hello.ab is not visible
//			System.out.println(x.ab);
		}
	}
class Lab371{
	public static void main(String[] args) {
		Hii h=new Hii();
		h.show();
	}
}