package com.dallas.sowmiya.main;

import com.dallas.sowmiya.model.*;


public class AppLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
 		// TODO Auto-generated method stub

		Vehicle vehicleObj = new Vehicle();
	     //vehicleObj.start();
	     //vehicleObj.stop();
	     
	     Truck truckObj = new Truck();
	     //truckObj.start();
	     //truckObj.stop();
	     
	     Car carObj = new Car();
	     //carObj.start(); 
	     //carObj.stop();
	    //carObj.cleanwindows();
	     carObj.printVnum();
	    
	     
	     //System.out.println("vehicle number for car is "+ carObj.vehicleNumber);
	     
	     //System.out.println("Vehicle.registrationState");
	     //System.out.println("vehicleObj.registrationState");
	     
	     MaruthiCar maruthiObj = new MaruthiCar();
	     
	     
	}

}
