package com.dallas.sowmiya.collections;

public class Trainer {
	private String name;
    private String subject;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
		
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		
	}
	public String toString(){
		return "Trainer: "+ this.name + "->" + this.subject;
	}

}
