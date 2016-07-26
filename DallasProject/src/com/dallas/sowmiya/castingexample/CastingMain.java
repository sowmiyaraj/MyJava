package com.dallas.sowmiya.castingexample;

public class CastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object obj = new Company();
		
		//Company compObj = new Company();
		//Nokia nokObj = new Nokia();
		//Ibm ibmObj = new Ibm();
		

		Company comObj1 = new Ibm();
		//Company comObj2 = new Ibm();
		if(comObj1 instanceof Nokia){
			System.out.println("IF in Nokia");
			Nokia nokObj = (com.dallas.sowmiya.castingexample.Nokia) comObj1;
			nokObj.doBusiness();
		}else if(comObj1 instanceof Ibm){
			System.out.println("Else If in IBM");
			Ibm ibmObj = (com.dallas.sowmiya.castingexample.Ibm) comObj1;
			ibmObj.doBusiness();
		}
		
		//compObj.doBusiness();
		//comObj1.doBusiness();
		//comObj2.doBusiness();
		
		//compObj.doBusiness();
		//nokObj.doBusiness();
		
		
		//obj = compObj; // implicit casting
		//compObj = (Company) obj; //Casting
		
		//System.out.println(obj.toString());
        
}
}