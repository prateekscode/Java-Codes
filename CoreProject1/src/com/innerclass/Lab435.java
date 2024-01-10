package com.innerclass;

class Outer1{
	int a=15;
	class Inner1{
		int a=55;
		void show() {
			System.out.println("Inner-show()");
			int a=22;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Inner1.this.a);
//			a cannot be resolved or is not a field
//			System.out.println(super.a);
			System.out.println(Outer1.this.a);
		}
	}
}

public class Lab435 {

	public static void main(String[] args) {
		new Outer1().new Inner1().show();
	}

}
