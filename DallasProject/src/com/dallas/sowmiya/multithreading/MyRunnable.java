package com.dallas.sowmiya.multithreading;

public class MyRunnable implements Runnable{
 volatile  boolean shouldRun = true;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(shouldRun){
	System.out.println("My Runnable interface is Running !!!");	
		}
		}
     
	  
	public void  stopMe(){
		this.shouldRun = false;
	}
	
}


