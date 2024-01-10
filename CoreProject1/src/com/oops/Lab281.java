package com.oops;

public class Lab281 {

	public static void main(String[] args) {
		Methre2 m=new Methre2();
		m.showRemainder(80, 12);
		m.showRemainder(60, 0);
	}

}
class Methre2{
	static void showRemainder(int a,int b) {
		if(b==0)
			return;
		System.out.println(a%b);
	}
}