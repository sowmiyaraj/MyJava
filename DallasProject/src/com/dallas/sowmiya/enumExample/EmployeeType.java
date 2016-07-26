package com.dallas.sowmiya.enumExample;

public enum EmployeeType {
    //no modifiers are allowed
    PERMANANENT(2),
	CONTRACT(1),
	INTERN(0);
	private int jobGrade;
	EmployeeType( int jobGrade) {
		// TODO Auto-generated constructor stub
	  this.jobGrade = jobGrade;
	}
	
	int getJobGrade(){
		return this.jobGrade;
	}
	void setJobGrade(int jobGrade){
		this.jobGrade = jobGrade;
	}
}
