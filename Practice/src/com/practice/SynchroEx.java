package com.practice;

public class SynchroEx {
	public static void main(String[] args) {
		Hello h1=new Hello();
		MT1 m=new MT1(h1);
		MT1 m2=new MT1(h1);
		m.start();
		m2.start();
	}
}

class MT1 extends Thread{
	Hello h=null;
	MT1(Hello h){
		this.h=h;
	}
	public void run() {
		h.show();
	}
}
class Hello{
	synchronized void show() {
		Thread th = Thread.currentThread();
		for(int i=0;i<6;i++)
			System.out.println(th.getName()+" "+i);
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
}