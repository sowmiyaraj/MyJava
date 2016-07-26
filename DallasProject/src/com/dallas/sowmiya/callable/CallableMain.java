package com.dallas.sowmiya.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Future<Integer> result;
		
		ExecutorService es = Executors.newCachedThreadPool();
		
		for(int i = 0 ; i < 20; i ++)
		{
			es.execute(new MyRunnable(i));
		}
	/*	Callable<Integer> myCallable = new MyCallable();
		result = es.submit(myCallable);
		try {
			System.out.println("Square of five is  " + result.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		es.shutdown();
		
	}

}
