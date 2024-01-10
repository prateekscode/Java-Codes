package com.oops;

public class Lab233a {

	public static void main(String[] args) {
		Test2 t1=new Test2();
		Test2 t2=new Test2();
		System.out.println(t1.b+"\t"+t2.b);
		t1.b=100;	 
		System.out.println(t1.b+"\t"+t2.b); //here if we change the value of static variable then it gives the same value with all objects.
	}

}
class Test2{
	static int b;
}
