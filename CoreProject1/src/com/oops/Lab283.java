package com.oops;

public class Lab283 {

	public static void main(String[] args) {
		Methre4 m=new Methre4();
		int a=m.display(10);
		System.out.println(a);
		System.out.println(m.display(50));
		m.display(39);
		System.out.println("Hello!");
	}

}
class Methre4{
	int display(int x) {
		return x+1; 
	}
}