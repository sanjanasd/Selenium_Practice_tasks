package com.javatopics;

class demo3 extends Thread{
	
	public void run() {
		System.out.println("new thread running");
	}
}
class Example{
public static void main(String[] args) {
	Thread dg=new Thread();
	dg.start();
	demo3 fg=new demo3();
	fg.run();
}
}
