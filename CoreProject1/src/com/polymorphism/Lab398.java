package com.polymorphism;

public class Lab398 {

	public static void main(String[] args) {
		Q w=new R();
		System.out.println(w.x);
	}

}
class Q{
	int x=19;
}
class R extends Q{
	String x="Welcome";
}