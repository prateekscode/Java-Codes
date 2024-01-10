package com.oops;

public class Lab270 {

	public static void main(String[] args) {
		cons10 c=new cons10(105,"Sahil");
		c.show();
		cons10 c1=new cons10(106,"Romil");
		c1.show();
	}

}
class cons10{
	int eid;
	String name;
	cons10(int eid,String name){
		this.eid=eid;
		this.name=name;
	}
	void show() {
		System.out.println(eid+"\t"+name);
	}
}