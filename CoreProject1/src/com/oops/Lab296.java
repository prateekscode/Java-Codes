package com.oops;

public class Lab296 {

	public static void main(String[] args) {
		Methoverload m=new Methoverload();
		int n=m.add(20, 30);
		System.out.println(n);//50
		m.add(20, 30);//add(int,int)
	}

}
class Methoverload{
	int add(int a,int b) {
		System.out.println("add(int,int)");//add(int,int)
		return a+b;
	}
/*This method can not be accessed due to duplicacy
	only only previous method accessed.
	*/ 
//	void add(int a,int b) {
//		System.out.println("void add(int,int)");
//	}
}