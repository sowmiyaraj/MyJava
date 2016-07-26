package com.dallas.sowmiya.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream is = new FileInputStream("input.txt");
			OutputStream os = new FileOutputStream("output.txt");
			int byteRead;
			while( (byteRead = is.read()) != -1){
				System.out.println("reading/writing " + byteRead);
				os.write(byteRead);
			}
			is.close();
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
