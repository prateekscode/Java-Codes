package com.thread;

public class Lab575 {

	public static void main(String[] args) {
		Rthread mt=new Rthread();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		t1.start();
		t2.start();
		Thread t=Thread.currentThread();
		for(int i=100;i<=110;i++) {
			System.out.println(t.getName()+"Value is-"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

class Rthread implements Runnable{
	public void run() {
		Thread th=Thread.currentThread();
		for(int i=1;i<=10;i++) {
			System.out.println(th.getName()+"Value is-"+i);
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
}