package com.oops;

public class Lab265 {

	public static void main(String[] args) {
		cons5 c=new cons5();
		/*here cons5 is accessed from object because it is a method
		 * not constructor. 
		 */
		c.cons5(101,"Prabal");
		c.show();
		//The constructor cons5(int, String) is undefined.
//		cons5 c1=new cons5(99,"Gagan");
	}

}
class cons5{
	int id;
	String name;
	void cons5(int sid,String sname) {
		System.out.println("2 parameter constructor.");
		id=sid;
		name=sname;
	}
	cons5(){
		System.out.println("Default constructor.");
	}
	void show() {
		System.out.println(id+"\t"+name);
	}
}