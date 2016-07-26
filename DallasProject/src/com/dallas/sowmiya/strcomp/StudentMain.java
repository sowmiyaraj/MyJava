package com.dallas.sowmiya.strcomp;

public class StudentMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age1 = 10;
		int age2 = 100;
		
	    if (age1 == age2){
	    	System.out.println("Age1 is equal to Age2");
	    }
	    String city1 = new String("Chen")+ new String("nai");
	    String city2 = new String("Chennai");
	    System.out.println("hashcode for cuty 1 is "+ city1.hashCode());
	    System.out.println("hashcode for city 2 is "+ city2.hashCode());
		if(city1.equals(city2)){
			System.out.println("City 1 is equal to City2");
		}else{
			System.out.println("city 1 different form city2");
		}
		System.out.println("== check on string ..."+(city1 == city2));
        Student s1 = new Student();
        Student s2 = new Student();
   
        System.out.println("hash for s1"+s1);
        System.out.println("hash for s2"+ s2);
        s1.setName(new String("ravi"));
        s2.setName(new String("ravi"));
       // s1=s2;
        if (s1.equals(s2)){
        	System.out.println("S1 equals S2 !!!");	
        }else{
        	System.out.println(" s1 not equal s2");
        }
        
        String name1 = "nagmani";
        String name2 = "nagmani";
      
        System.out.println("name1 == name2" + (name1==name2));
        System.out.println("name equals name2"+ (name1.equals(name2)));
        
     }

}

/*
== compares variable content
equals compare object contents
string pool, improving string performance, string literals are stored for reusabilty.
*/