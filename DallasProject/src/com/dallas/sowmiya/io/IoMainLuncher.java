package com.dallas.sowmiya.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IoMainLuncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Car cObj = new Car();
		 cObj.setModel("porche");
		 cObj.setNumber(9999);
		 //cObj = null;
		 try{
		 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("car.ser"));
		 os.writeObject(cObj);
		 os.flush();
		 os.close();
		 }*/
		try{
		 ObjectInputStream is = new ObjectInputStream(new FileInputStream("car.ser"));
		 Car retrievedObj = (Car)is.readObject();
		 System.out.println("desrilialization mode is "+ retrievedObj.getModelName());
		 System.out.println("desrialization number is "+ retrievedObj.getNumber());
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		
	}

}
