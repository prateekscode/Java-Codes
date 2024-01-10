package com.oops;

public class Lab304 {
	
public static void main(String[] args) {
	methoverload8 m=new methoverload8();
	m.display(null);
	m.display("Hello!");
	m.display(m);
}

}
class methoverload8{
	void display(String str) {
		System.out.println("display(string)");
	}
	void display(Object str) {
		System.out.println("display(object)");
	}
}