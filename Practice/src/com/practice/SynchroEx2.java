package com.practice;

public class SynchroEx2 {
	public static void main(String[] args) {
		Hello1 h1 = new Hello1();
		MT2 m = new MT2(h1);
		MT2 m2 = new MT2(h1);
		m.start();
		m2.start();
	}
}

class MT2 extends Thread {
	Hello1 h = null;

	MT2(Hello1 h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}
}

class Hello {
	void show() {
		Thread th = Thread.currentThread();
		synchronized (this) {
			for (int i = 0; i < 6; i++)
				System.out.println(th.getName() + " " + i);
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}