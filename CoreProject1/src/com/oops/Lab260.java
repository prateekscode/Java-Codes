package com.oops;

public class Lab260 {

	public static void main(String[] args) {
		cons c1=new cons();
		c1.show();
		cons c2=new cons();
		c2.show();
	}

}
class cons{
	int id;
	String name;
	void show() {
		System.out.println(id+"\t"+name);
	}
}