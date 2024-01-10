package com.oops;

public class Lab290 {

	public static void main(String[] args) {
		Methre11 m=new Methre11();
		System.out.println(m.show(50));
	}

}
class Methre11{
	boolean show(int x) {
		System.out.println("Show()");
		return true;
	}
}