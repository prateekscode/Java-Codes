package com.oops;

public class Lab295 {

	public static void main(String[] args) {
		Methpara2 m=new Methpara2();
//		The method show(char) in the type Methpara2 is not applicable for the arguments (int).
//		m.show(10);
		m.show('A');
		m.show((char)65);
	}

}
class Methpara2{
	void show(char x) {
		System.out.println("show(char)");
	}
}