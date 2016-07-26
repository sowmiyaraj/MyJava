package com.dallas.sowmiya.multithreading;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("current thread is" + Thread.currentThread().getName());
		/*Thread myThreadObj1 = new MyThread();
		 myThreadObj1.setName("sowmiya thread");
		 myThreadObj1.start();
		 Thread myThreadObj2 = new MyThread();
			myThreadObj2.setName("nagmani thread");
		 myThreadObj2.start();
		 
		 
		 
		 
		/*for (int i = 0 ; i < 10; i ++){
			
			Thread myThread = new MyThread();
			myThread.start();
		}*/
		 MyRunnable myRunnable = new MyRunnable();
		Thread myThread = new Thread(myRunnable);
		myThread.setName("ravithread");
		myThread.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		myRunnable.stopMe();
	}

}
