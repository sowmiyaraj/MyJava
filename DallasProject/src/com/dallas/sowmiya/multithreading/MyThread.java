package com.dallas.sowmiya.multithreading;

public class MyThread  extends Thread {

	
	
	public void run(){
		while(true){
		System.out.println("my thread is runnning.." + Thread.currentThread().getName());
		}
	}
	
}
