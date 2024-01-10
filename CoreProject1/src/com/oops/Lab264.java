package com.oops;

public class Lab264 {

	public static void main(String[] args) {
		cons4 c=new cons4();
		/*The method cons4(String, int) is undefined for the type cons4,
		  because we call method using object not constructor
		 */
		//c.cons4("Pawan",101);
		cons4 c1=new cons4("Pawan",101);
		c1.details();
	}

}
class cons4{
	String name;
	int id;
	cons4(String n,int i){
		System.out.println("2 parameter constructor");
		name=n;
		id=i;
	}
	cons4(){
		System.out.println("Default Constructor");
	}
	void details() {
		System.out.println(name+"\t"+id);
	}
}