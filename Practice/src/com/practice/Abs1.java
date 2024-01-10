package com.practice;

abstract class Abs2 {
	int a;
	String n;

	Abs2(int a, String n) {
		this.a = a;
		this.n = n;
	}

	abstract void show();

	void display() {
		System.out.println("Namaste!");
	}
}

class Abs1 extends Abs2 {
	void show() {
		System.out.println(a);
		System.out.println(n);
	}

	Abs1() {
		super(23, "Rohit");
	}

	public static void main(String[] args) {
		Abs2 a = new Abs1();
		a.display();
		a.show();
	}
}