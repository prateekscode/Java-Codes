package com.practice;

public class ThreadEx2 {
	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName());
		Thr1 thr1=new Thr1();
		System.out.println(thr1.getName());
		thr1.start();
	}
}
class Thr1 extends Thread{
	@Override
	public void run() {
		System.out.println("2nd thread");
	}
}