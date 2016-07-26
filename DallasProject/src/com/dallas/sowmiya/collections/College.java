package com.dallas.sowmiya.collections;

public class College implements Comparable<College>{
	private String name;
    private int yearOfStarting;
	@Override
	public int compareTo(College otherCollege) {
		// TODO Auto-generated method stub
		if(this.yearOfStarting > otherCollege.yearOfStarting){
			return 1;
		}else if(this.yearOfStarting < otherCollege.yearOfStarting){
			return -1;
		}else{
			return 0;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYearOfStarting() {
		return yearOfStarting;
	}
	public void setYearOfStarting(int yearOfStarting) {
		this.yearOfStarting = yearOfStarting;
	}
	
	public String toString(){
		return "College: "+ this.name;
	}

	
    
}
