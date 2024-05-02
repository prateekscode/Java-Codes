package com.practice;

public class MethOver {
	public static void main(String[] args) {
		Exb e=new Exb();
		System.out.println(e.add(2, 3, 4));
		System.out.println(e.add(2, 4));
	}

}
class Exa{

	int add(int a, int b) {
		return a + b;
	}
	
}
class Exb extends Exa{
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}