package com.oops;

public class Lab293 {

	public static void main(String[] args) {
		Methpara m=new Methpara();
//		The method show(int) in the type Methpara is not applicable for the arguments ()
//		System.out.println(m.show());
//		The method println(int) in the type PrintStream is not applicable for the arguments (int, int)
//		System.out.println(20,30);
		System.out.println(m.show(20));
	}

}
class Methpara{
	int show(int n) {
		System.out.println("show()");
		return n+1;
	}
}