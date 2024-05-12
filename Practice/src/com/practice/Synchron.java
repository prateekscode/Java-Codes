package com.practice;

class Counter {
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class Synchron {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();

		Thread th1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				c.increment();
			}
		});

		Thread th2 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				c.increment();
			}
		});
		
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		
		System.out.println("Counter: "+c.count);
	}
}