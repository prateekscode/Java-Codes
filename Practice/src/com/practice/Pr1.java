package com.practice;

public class Pr1 {

	public static void main(String[] args) {
	Test t=new Test();
	Test t3=new Test(12,"Tanmay","Abhay");
	System.out.println(t.a);
	System.out.println(t.b);
	System.out.println(Test.b);
	System.out.println(t.name);

	
	
	}

}
class Test{
	int a=55;
	static int b;
	String name="Rahul";
	String add;
	
	static {
		System.out.println("SIB>>>");
		System.out.println(b);
		Test t1=new Test();
		System.out.println(t1.a);
		System.out.println(t1.name);
	}
	
	{
		System.out.println("IIB>>>");
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
		System.out.println(add);
	}
	
	Test(){
		
	}
	
	Test(String ad){
		this.add=ad;
	}
	
	Test(int n,String nm, String nma){
		this.a=n;
		this.add=nm;
		this.name=nma;
	}
}