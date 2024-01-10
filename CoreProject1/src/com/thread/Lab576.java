package com.thread;

public class Lab576 {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("We");
		Mthread2 th1=new Mthread2(tg,"NaMaste Thread");
		Mthread2 th2=new Mthread2();
		th1.start();
		th2.start();
	}
}

class Mthread2 extends Thread{
	Mthread2(ThreadGroup tg,String name){
		super(tg,name);
	}
	Mthread2(){}
	public void run() {
		ThreadGroup tg=getThreadGroup();
		int pr=getPriority();
		for(int i=0;i<5;i++){
			System.out.println(i+" "+getName()+" "+tg.getName()+" "+pr);
		}
	}
}