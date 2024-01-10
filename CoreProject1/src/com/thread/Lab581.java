package com.thread;

public class Lab581 {

	public static void main(String[] args) {
		Game g1=new Game();
		Game g2=new Game();
		Mthread5 mt=new Mthread5(g1);
		Mthread5 mt1=new Mthread5(g2);
		mt.start();
		mt1.start();
	}

}

class Mthread5 extends Thread{
	Game g=null;
	Mthread5(Game g){
		this.g=g;
	}
	public void run() {
		g.show();
	}
}
class Game{
	synchronized void show() {
		Thread th=Thread.currentThread();
		for(int i=0;i<5;i++) {
			System.out.println(th.getName()+"-Show: "+i+"\t"+this);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}