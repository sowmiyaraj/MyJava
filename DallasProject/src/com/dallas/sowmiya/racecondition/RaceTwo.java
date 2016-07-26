package com.dallas.sowmiya.racecondition;

public class RaceTwo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			synchronized (Integer.class) {
				System.out.println("race two --acquired lock on Integer . ");
				synchronized (String.class) {
					System.out.println(" race two acquired lock on  String....");
					System.out.println(" hello I am race two");
					notify();
				}
			}
			
	}

}
