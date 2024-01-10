package com.cloning;

class C implements Cloneable{
	int a;
	int b;
	C(int a, int b){
		this.a=a;
		this.b=b;
	}
	void show() {
		System.out.println(a+"\t"+b);
	}
	public Object clone() throws
	CloneNotSupportedException{
		System.out.println("Hello- clone()");
		Object ob=super.clone();
		return ob;
		}
}
public class Lab452 {

	public static void main(String[] args) {
	C n1=new C(80,98);
	C n2=n1;
	System.out.println(n1==n2);
	try {
		C n3=(C)n1.clone();
		System.out.println(n1==n3);
		}
	catch(Exception e) {
		System.out.println("My Exception:"+e);
	}
	System.out.println("End");
	}
}
