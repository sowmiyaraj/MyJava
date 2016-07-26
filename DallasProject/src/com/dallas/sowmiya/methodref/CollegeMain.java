package com.dallas.sowmiya.methodref;

import com.dallas.methodreference.Espn;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 //Example using Lambda Expression		
    Admission admission = (int admitID, String admitName) -> {
      return admitName+" "+admitID;	
    };
    System.out.println("Admission : "+ admission.studentInfo(001, "Sowmiya"));
   
 //Example using static method for method reference
    //Admission admission = College::studentInfo;
    //admission = College::studentInfo;
    //System.out.println("Admission : "+ admission.studentInfo(002, "Nagamani"));
 
 //Example using class object for method reference
    College collObj = new College();
    admission = collObj::studentInfo;
    System.out.println("Admission : "+ admission.studentInfo(003, "Ravi"));
    
    
    System.out.println(provideAdmissionInfo((int id, String name) -> { return id+ name;}, 5, "mohan"));
    
	
	}
    
	

	public static String provideAdmissionInfo(Admission admission, int id, String name){
	  return admission.studentInfo(id, name);
	}
	
	
}
