package com.dallas.sowmiya.model;


public class Truck extends Vehicle {
 
	/*public Truck(){
		System.out.println("Truck object is getting created");
		
	}*/
	
	public void start(){
		   System.out.println("Starting truck in Truck class");
	   }
	
	public Truck(String vehicleNumber){
		
		super(vehicleNumber);
		this.vehicleNumber = vehicleNumber;
		System.out.println("Argument Constructor");
				
	}
	
	public void ignite(){
		super.start();
		this.start();
		System.out.println("This is Ignite method !!!");
	}
	
	
	public void regsiterWiThRTo(RtoRegistration rto){
		//Truck tObj = new Truck("abcd");
		rto.register(this);
	}
}
