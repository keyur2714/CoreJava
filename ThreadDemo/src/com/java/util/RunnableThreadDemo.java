package com.java.util;

public class RunnableThreadDemo implements Runnable{

	static int cnt = 10;
	
	@Override
	public void run() {
		System.out.println("Hello 1");
		System.out.println(Thread.currentThread().getName());
		if(Thread.currentThread().getName().equals("t1")) {		
			cnt++;
		}else if(Thread.currentThread().getName().equals("t2")) {
			cnt+=2;
		}
	}
	
	public static int getCount(){
		return cnt;
	}
	
	
}
