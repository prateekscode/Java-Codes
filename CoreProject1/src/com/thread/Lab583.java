package com.thread;

public class Lab583 {

	public static void main(String[] args) {
		Game2 g1=new Game2();
		Game2 g2=new Game2();
		Mthread7 mt=new Mthread7(g1);
		Mthread7 mt1=new Mthread7(g2);
		mt.start();
		mt1.start();
	}

}

class Mthread7 extends Thread{
	Game2 g=null;
	Mthread7(Game2 g){
		this.g=g;
	}
	public void run() {
		g.show();
	}
}
class Game2{
	synchronized static void show() {
		Thread th=Thread.currentThread();
			for(int i=0;i<5;i++) {
				System.out.println(th.getName()+"Show: "+i);
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}