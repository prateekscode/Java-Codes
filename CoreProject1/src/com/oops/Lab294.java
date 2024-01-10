package com.oops;

public class Lab294 {

	public static void main(String[] args) {
		Methpara1 m=new Methpara1();
//		The method show(byte) in the type Methpara1 is not applicable for the arguments (int)
//		m.show(12);
		byte b=12;
		m.show(b);
		m.show((byte)12);//typecasting
	}

}
class Methpara1{
	void show(byte n) {
		System.out.println("show(byte)");
	}
}