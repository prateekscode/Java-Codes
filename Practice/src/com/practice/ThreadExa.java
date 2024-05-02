package com.practice;

public class ThreadExa {
	public static void main(String[] args) {
		Mthread th=new Mthread();
		th.start();
		
		Rthread rt=new Rthread();
		Thread t=new Thread(rt);
		t.start();
	}
}

class Mthread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 9; i++)
			System.out.println("hii");
	}
}

class Rthread implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println("Hello");
	}
}