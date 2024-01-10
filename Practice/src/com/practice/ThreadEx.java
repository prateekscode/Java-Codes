package com.practice;

public class ThreadEx {
	public static void main(String[] args) {
		Thread1 th = new Thread1();
		th.start();
		Thread2 th1 = new Thread2();
		th1.start();
		Thread3 th2 = new Thread3();
		th2.start();
		//For  Runnable interface
		Thread4 th4 = new Thread4();
		Thread ths = new Thread(th4);
		ths.start();
		System.out.println("------------------------------");
		//Printing thread references
		System.out.println(th + "\n" + th1 + "\n" + th2 + "\n" + th4 + "\n" + ths);
	}

}

//By extending java.lang.Thread
class Thread1 extends Thread {
	public void run() {
		System.out.println("Thread1 run()");
	}
}

class Thread2 extends Thread {
	public void run() {
		System.out.println("Thread2 run()");
	}
}

class Thread3 extends Thread {
	// Changing name of thread given by compiler
	Thread3() {
		super("3rd Wali Thread");
	}

	public void run() {
		System.out.println("Thread3 run()");
	}
}

//By implementing java.lang.Runnable interface
class Thread4 implements Runnable {
	public void run() {
		System.out.println("Thread4 run()" + "\t" + "By implementing Runnable interface");
	}
}