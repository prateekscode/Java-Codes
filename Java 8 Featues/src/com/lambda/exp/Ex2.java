package com.lambda.exp;
public class Ex2 {

	public static void main(String[] args) {	
		Runnable runnable=()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Hey "+i);
			}
		};
		Thread childThread=new Thread(runnable);
		childThread.run();
	}
}
