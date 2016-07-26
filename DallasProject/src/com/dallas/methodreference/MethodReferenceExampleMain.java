package com.dallas.methodreference;

public class MethodReferenceExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Play play = () -> { return "football";};
       //System.out.println(play.getGameName());
       Messi mObj = new Messi();
       play = mObj::getMessiGameName;
       //System.out.println(play.getGameName());
       
       //MyCompany
       MyCompany company = (String info) -> {
    	   //System.out.println(info);
    	   return 35;
    	   };
       
       int result = company.doBusiness("infosys");
       //System.out.println(result);
       Espn espnObj = new Espn();
       
      company = espnObj::doBusiness;
      //System.out.println(company.doBusiness("ESPN"));
      
      Course course = ()-> {return "LambdaJava";};
      //System.out.println(course.coursename());
      
      course = Institute::getCourseName;
      //System.out.println(course.coursename());
      
     /* //SUM
      Sum sum = (int a, int b) -> {
    	int c = a + b;
    	System.out.println("this is using lambda expression..");
    	return c;
       };
       System.out.println(sum.sumOf(10, 20));
       
       
       sum = Maths::sumOf;
       System.out.println(sum.sumOf(4, 3));
       
      }*/
	Student sObj = new Student();
	College college = Student::new;
	
	
	//Trainer tObj = new Trainer();
	CoachingCentre centre = Trainer::new;
	Trainer tobj = centre.trainerName();
  }
}


