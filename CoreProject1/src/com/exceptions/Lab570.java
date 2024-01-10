package com.exceptions;

import java.io.IOException;

public class Lab570 {

	public static void main(String[] args) {
		System.out.println("main started");
		Excepn ex=new Excepn();
		ex.show();
		System.out.println("main end");
		
	}

}
class Excepn{
	void show() {
		System.out.println("Show started");
		try {
			new A().m1();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
class A{
	void m1() throws IOException{
		System.out.println("M1() started");
		new B().m2();
		System.out.println("M1() end");
	}
}
class B{
	void m2() throws IOException{
		System.out.println("M2() started");
		new C().m3();
		System.out.println("M2 end");
	}
}
class C{
	void m3() throws IOException{
		System.out.println("m3() started");
		IOException e=new IOException();
		if(1==1) {
			throw e;
		}
		System.out.println("M3() end");
	}
}