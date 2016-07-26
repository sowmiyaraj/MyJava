package com.dallas.sowmiya.functionalprogramming;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.*;
public class FunctionalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Eatable eatObj1 = () -> System.out.println("I am eating !!!");
		
		Eatable eatObj2 = (String sweets) -> {System.out.println("Eating " + sweets);};
		eatObj2.eat("laddu");
		
		Consumer<String>  consumer= (String name) -> { System.out.println("name is " + name);};
		consumer.accept("naagamani");
		
		
		Function<String, Integer> myFunction = (String s) ->{  return Integer.parseInt(s)*Integer.parseInt(s);};
		System.out.println(myFunction.apply("5"));
	    
		
		Predicate<Integer> predicate = (Integer age) -> 
		                                                    { 
			                                               if(age > 18){
			                                            	   System.out.println("can vote");
			                                            	   return true;
		                                                    }else{
		                                                    	System.out.println("monor");
		                                                    	return false;
		                                                    }
		};
		
		System.out.println(predicate.test(15));
		
		
		Supplier<String> supplier = () -> {return "ravi";};
	   System.out.println(supplier.get());
	   
	   Comparable<String> myComparable = (String other) ->{  return other.length();};
	    Runnable myRunnable = () -> { System.out.println("This is runnable using lambda expression");};
	    
	    new Thread(myRunnable).start();
	   
	   
	}

}
