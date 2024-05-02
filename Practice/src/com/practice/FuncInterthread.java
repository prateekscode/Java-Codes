package com.practice;

public class FuncInterthread {
	public static void main(String[] args) {
		Runnable r = () -> {
			for(int i=0;i<5;i++)
			System.out.println("Jai Ho");
		};
		Runnable r1=()->{
			int a=8;
			int b=6;
			System.out.println(a-b);
			System.out.println(a+b);
			System.out.println(a*b);
		};
		Thread t=new Thread(r);
		t.start();
		
		Thread t1=new Thread(r1);
		t1.start();
		
	}
}
