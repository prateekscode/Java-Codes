package com.oops;

public class Lab289 {

	public static void main(String[] args) {
		Methre10 m=new Methre10();
		System.out.println(m.show(100));
	}

}
class Methre10{
	long show(int x) {
		System.out.println("Show()");
		return x+1;
	}
}