package com.innerclass;

class Hello{
	{
	System.out.println("IB Hello");
	class Inner{}
	}
	static {
		System.out.println("SB Hello");
		class Inner{}
	}
	Hello(){
		System.out.println("Deafult cons Hello");
		class Inner{}
	}
	void m1() {
		System.out.println("m1()-hello");
	}
}
public class Lab437 {

	public static void main(String[] args) {
		System.out.println("Namaste Guys");
	}

}
