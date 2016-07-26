package com.dallas.sowmiya.exceptionExample;

public class StudentIsTiredException  extends Exception {

	private String msg;
	
	public StudentIsTiredException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	   this.msg = msg;
	}
	
	
	public String toString(){
		return msg;
	}
	
}
