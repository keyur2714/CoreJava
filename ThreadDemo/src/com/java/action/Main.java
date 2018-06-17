package com.java.action;

import com.java.util.RunnableThreadDemo;
import com.java.util.ThreadDemo;

public class Main {

	public static void main(String[] args) {
		System.out.println("Thread Demo");
		RunnableThreadDemo runnableThreadDemo=new RunnableThreadDemo();
		Thread t1=new Thread(runnableThreadDemo,"Thread 1");				
		System.out.println(RunnableThreadDemo.getCount());
		Thread t2=new Thread(runnableThreadDemo,"Thread 2");
		t1.start();
		t2.start();
		System.out.println(RunnableThreadDemo.getCount());
		
		System.out.println("============");
		
		ThreadDemo threadDemo1 = new ThreadDemo("TH1");
		threadDemo1.start();
		
		ThreadDemo threadDemo2 = new ThreadDemo("TH2");
		threadDemo2.start();
		
		
	}

}
