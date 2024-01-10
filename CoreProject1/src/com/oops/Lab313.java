package com.oops;

public class Lab313 {

	public static void main(String[] args) {
		Varargs3 v=new Varargs3();
		v.add(new int[0]);
		v.add(new int[] {10,20,30,40,50});
		v.add(new int[] {30,30,30});
		v.add();
		v.add(10,10,10);
		v.add(10,20,20,10);
	}

}
class Varargs3{
	void add(int... ar) {
		System.out.println("add(int... ar");
		System.out.println("LEngth: "+ar.length);
		int a=0;
		for(int b:ar) {
			a=a+b;
		}
		System.out.println("Sum is: "+a);
	}
}