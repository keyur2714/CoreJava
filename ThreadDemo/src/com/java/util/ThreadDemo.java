package com.java.util;

public class ThreadDemo extends Thread{
	
	public ThreadDemo(String threadName) {
		super(threadName);
	}
	
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(this.currentThread().getName()+" "+i);
			if(i==5) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
