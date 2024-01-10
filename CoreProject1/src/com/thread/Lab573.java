package com.thread;

public class Lab573 {

	public static void main(String[] args) {
		System.out.println("main started--");
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		System.out.println(th.getId()+" "+th.getName()+" "+tg.getName());
		for(int i=0;i<args.length;i++) {
			String st=args[i];
			System.out.println(th.getId()+" "+th.getName()+" "+tg.getName()+" "+st);
		}
		System.out.println("main ended..");
	}

}
