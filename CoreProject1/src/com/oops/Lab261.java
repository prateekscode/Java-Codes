package com.oops;

public class Lab261 {

	public static void main(String[] args) {
		cons1 c=new cons1();
		c.sid=101;
		c.sname="Ram";
		c.show();
	}

}
class cons1{
	int sid;
	String sname;
	cons1(){
		System.out.println("Default constructor");
	}
	void show() {
		System.out.println(sid+"\t"+sname);
	}
}