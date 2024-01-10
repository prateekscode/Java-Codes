package com.interfaces;

interface Inter11{
	void show();
}
class I12{
	public void show() {
		System.out.println("I12--show()");
	}
}
class I13 extends I12 implements Inter11{
	
}
public class Lab421 {

	public static void main(String[] args) {
		I13 i=new I13();
		i.show();
	}

}
