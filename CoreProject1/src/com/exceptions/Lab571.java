package com.exceptions;

public class Lab571 {

	public static void main(String[] args) {
		System.out.println("main started");
		Excepn1 ex=new Excepn1();
		ex.show();
		System.out.println("main end");
		
	}

}
class Excepn1{
	void show() {
		System.out.println("Show started");
		try {
			new D().n1();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}
class D{
	void n1(){
		System.out.println("N1() started");
		new E().n2();
		System.out.println("N1() end");
	}
}
class E{
	void n2(){
		System.out.println("N2() started");
		new F().n3();
		System.out.println("N2 end");
	}
}
class F{
	void n3(){
		System.out.println("N3() started");
		NullPointerException e=new NullPointerException();
		if(1==1) {
			throw e;
		}
		System.out.println("N3() end");
	}
}