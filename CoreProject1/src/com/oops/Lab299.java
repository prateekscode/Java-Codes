package com.oops;

public class Lab299 {

	public static void main(String[] args) {
		methoverload3 m=new methoverload3();
		System.out.println(m.sum(35, "Welcome"));
		System.out.println(m.sum("Namaste!", 70));
	}

}
class methoverload3{
	String sum(int a,String b){
		System.out.println("sum(int,String)");
		return a+b;
	}
	String sum(String a,int b) {
		System.out.println("sum(String,int)");
		return a+b;
	}
}