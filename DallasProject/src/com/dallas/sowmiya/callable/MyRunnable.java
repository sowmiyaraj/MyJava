package com.dallas.sowmiya.callable;

public class MyRunnable  implements Runnable{

	
	int modelThreadNumber;
	
	public MyRunnable(int modelThreadNumber) {
		// TODO Auto-generated constructor stub
		this.modelThreadNumber = modelThreadNumber;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("my runnable is running...name is "+ Thread.currentThread().getName()+ "model thread number is "+ modelThreadNumber);
		}
	}

}
