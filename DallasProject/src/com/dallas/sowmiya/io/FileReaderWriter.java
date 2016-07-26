package com.dallas.sowmiya.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader = null;
		FileWriter writer = null;
		try {
		reader = new FileReader("input.txt");
		writer = new FileWriter("output.txt");
		
		int charRead;
		
			while((charRead = reader.read()) != -1){
				System.out.println("writing char " + charRead);
				writer.write(charRead);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
