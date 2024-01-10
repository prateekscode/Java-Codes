package com.oops;

public class Lab312 {

	public static void main(String[] args) {
		Varargs2 v=new Varargs2();
		v.sum(new int[] {10,20,30,40});
		v.sum(new int[] {3,3,3});
	}

}
class Varargs2{
	void sum(int ar[]) {
		System.out.println("sum(ar[])");
		System.out.println("LEngth: "+ar.length);
		int a=0;
		for(int b:ar) {
			a=a+b;
		}
		System.out.println(a);
	}
}