package com.thread;

public class Lab574 {

	public static void main(String[] args) {
		Mthread t1=new Mthread();
		Mthread t2=new Mthread();
		t1.start();
		t2.start();
		Thread t=Thread.currentThread();
		for(int i=100;i<=110;i++) {
			System.out.println(t.getName()+"-value is:"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

class Mthread extends Thread{
	public void run() {
		Thread th=Thread.currentThread();
		for(int i=1;i<=10;i++) {
			System.out.println(th.getName()+"-value is:"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}