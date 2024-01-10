package com.oops;

public class Lab288 {

	public static void main(String[] args) {
		Methre9 m=new Methre9();
		System.out.println(m.show(10));//65
	}

}
class Methre9{
	long show(int x) {
		System.out.println("Show()");
		return 'A';
	}
}