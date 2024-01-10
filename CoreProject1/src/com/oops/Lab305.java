package com.oops;

public class Lab305 {

	public static void main(String[] args) {
		methoverload9 m=new methoverload9();
		m.display("Namaste!");
		m.display(m);
		m.display(null);
	}

}
class methoverload9{
	void display(String str) {
		System.out.println("display(String)");
	}
	void display(Object str	) {
		System.out.println("display(Object)");
	}
}