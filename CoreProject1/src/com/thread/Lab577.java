package com.thread;

public class Lab577 {

	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("We");
		Mthread3 thr=new Mthread3();
		Thread th1=new Thread(tg,thr,"Hii thread");
		Thread th2=new Thread(thr);
		th1.start();
		th2.start();
	}

}
class Mthread3 implements Runnable{
	public void run() {
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		int pri=th.getPriority();
		for(int i=0;i<5;i++) {
			System.out.println(i+" "+th.getName()+" "+tg.getName()+" "+pri);
		}
	}
}