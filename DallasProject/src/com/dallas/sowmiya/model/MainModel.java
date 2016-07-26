package com.dallas.sowmiya.model;

public class MainModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle vehicleObj = new Vehicle();
	    // vehicleObj.start();
	     //vehicleObj.stop();
	    Truck truObj = new Truck("QWERTY");
	    truObj.ignite();
	    RtoRegistration rto = new RtoRegistration();
	    truObj.regsiterWiThRTo(rto);
	}

}
