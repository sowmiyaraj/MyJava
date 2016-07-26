package com.dallas.sowmiya.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{  
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("ravi.txt"));
		//dos.writeInt(66);
		int age = 65500;
		dos.writeInt(age);
		//dos.writeUTF("hello ravi");
	    //dos.writeFloat(3.14f);
		dos.flush();
		dos.close();
		DataInputStream dis = new DataInputStream(new FileInputStream("ravi.txt"));
		
		while(dis.available() > 0){
			
			System.out.println(dis.readInt());
			//System.out.println(dis.readUTF());
			//System.out.println(dis.readFloat());
		}
		dis.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
