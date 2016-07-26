package com.dallas.sowmiya.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
			BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
			String lineRead;
			while( (lineRead = bufferReader.readLine()) != null){
				System.out.println("reading/writing line = " + lineRead);
				bufferWriter.write(lineRead);
			}
			bufferReader.close();
			bufferWriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
