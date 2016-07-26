package com.dallas.sowmiya.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		/*while(true){
			System.out.println("my Callable is running !!! ");
	   }*/
		return 5*5;
	}
	

}
