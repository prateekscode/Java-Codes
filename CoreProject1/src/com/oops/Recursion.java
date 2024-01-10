package com.oops;

public class Recursion {

	public static void main(String[] args) {
		Rec r = new Rec();
		r.display();
		r.show();
	}

}

class Rec {
	int a = 0;

	void display() {
		for (int i = 0; i < 9; i++) {
			System.out.println("HEllo!");
		}
	}

	void show() {
		System.out.println("NAmaste!");
		a++;
		if (a < 10)
			show();
	}
}