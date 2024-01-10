package com.thread;

public class Lab578 {

	public static void main(String[] args) {
		Mthread4 t1=new Mthread4();
		t1.setPriority(10);
//		t1.setPriority(0);
//		t1.setPriority(11);
		System.out.println(t1);

	}

}
class Mthread4 extends Thread{}