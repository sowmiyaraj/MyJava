package com.dallas.sowmiya.exceptionExample;

public class ClassCancelledException extends Exception {
	private String notify;
	
	public ClassCancelledException(String notify) {
		// TODO Auto-generated constructor stub
		super(notify);
	   this.notify = notify;
	}
	
	
	public String toString(){
		return notify;
	}
	

}
