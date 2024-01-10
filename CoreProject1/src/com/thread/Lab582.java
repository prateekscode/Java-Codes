package com.thread;

public class Lab582 {

	public static void main(String[] args) {
		Game1 g1=new Game1();
		Game1 g2=new Game1();
		Mthread6 mt=new Mthread6(g1);
		Mthread6 mt1=new Mthread6(g2);
		mt.start();
		mt1.start();
	}

}

class Mthread6 extends Thread{
	Game1 g=null;
	Mthread6(Game1 g){
		this.g=g;
	}
	public void run() {
		g.show();
	}
}
class Game1{
	synchronized void show() {
		Thread th=Thread.currentThread();
		synchronized (this) {
			for(int i=0;i<5;i++) {
				System.out.println(th.getName()+"Show: "+i+"\t"+this);
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}