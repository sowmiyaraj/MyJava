package com.dallas.sowmiya.enumExample;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSalary(EmployeeType.PERMANANENT);
		
		EmployeeType nokiaEmpType = EmployeeType.PERMANANENT;
	    nokiaEmpType.setJobGrade(10);
	    printSalary(nokiaEmpType);
	}
    static  void printSalary(EmployeeType empType){
    	switch (empType){
    	case PERMANANENT:
    		System.out.println("Permanent Employee" + " Grade: " +empType.getJobGrade());
    		System.out.println(empType.ordinal());
    	break;
    	
    	case CONTRACT:
    		System.out.println("Contract Employee"+ " Grade: " +empType.getJobGrade());
    		System.out.println(empType.ordinal());
    	break;
    	
    	case INTERN:
    		System.out.println("Intern student"+ " Grade: " + empType.getJobGrade());
    		System.out.println(empType.ordinal());
    		break;
    	
    	default: System.out.println("Employee type is undefined");
    	}
    }
}
