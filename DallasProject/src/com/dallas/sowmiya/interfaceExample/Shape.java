package com.dallas.sowmiya.interfaceExample;

interface Shape extends Geometry, Color{
 String length = "20";	
 void draw();
 
 default void co_ordinates(){
	 System.out.println("Printing Co-ordinates !!!");
 }
 static void three_d(){
	 System.out.println("This shape is in 3 dimension !!!");
 }
}
