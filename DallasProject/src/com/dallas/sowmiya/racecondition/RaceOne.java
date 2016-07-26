package com.dallas.sowmiya.racecondition;



public class RaceOne implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		synchronized (Integer.class) {
			System.out.println("race one --acquired lock on Integer . ");
			if(Thread.holdsLock(Integer.class)){
				System.out.println("releasing lock on Integer class");
				notify();
				
			}
			synchronized (String.class) {
				System.out.println(" race one acquired lock on  String....");
				System.out.println(" hello I am race One");
				
				if(Thread.holdsLock(String.class)){
					System.out.println("releasing lock on String class ");
				}
			}
		}
		
	}

}
