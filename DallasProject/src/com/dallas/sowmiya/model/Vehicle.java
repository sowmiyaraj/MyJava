package com.dallas.sowmiya.model;

public class Vehicle {

/*public Vehicle(){
	System.out.println("Vehicle object is getting created in constructor !!");
}*/

public Vehicle(String vehicleNumber){
	this.vehicleNumber = vehicleNumber;
	System.out.println("Vehicle object with argument is getting created in constructor !!");
}
	
public static String registrationState= "karnataka";
public String vehicleNumber = "ABCDE";
//Truck truObj = new Truck();	
	
protected void start(){
      System.out.println("vehicle is starting....");
	}
	
protected 	void stop(){
		System.out.println("vehicle is stopping....");
	}
}
