package com.dallas.finalexample;

public class Company {
	
	final int empID = 001;
	static String empName = "Sow";
	
    Company(){
    	System.out.println("Welcome to the Company");
    }
    
    final void printEmpId(){
    	System.out.println("Employee ID is " + empID);
    }
    
    final static void printEmpName(){
    	System.out.println("Employee name is " + empName);
    }
    
    void updateEmpid(int updatedid){
    	updateid = 678;
    	System.out.println("Updated Employee ID is " + updatedid);
    }
    
}
