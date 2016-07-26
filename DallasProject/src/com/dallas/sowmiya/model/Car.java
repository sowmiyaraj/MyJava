package com.dallas.sowmiya.model;

public class Car extends Vehicle {
   public Car(String vehicleNumber) {
		super(vehicleNumber);
		// TODO Auto-generated constructor stub
	}

public String vehicleNumber = "XYZ";

   public void printVnum(){
	   System.out.println("this is my car vehicle num = " + this.vehicleNumber);
	   System.out.println("this is my vehicle - vehicle num = " + super.vehicleNumber);
   }
   public void cleanwindows(){
	   System.out.println("Clean the windows !!!");
	   
   }
   
   protected void start(){
	   System.out.println("Starting car in Car class");
   }
}
