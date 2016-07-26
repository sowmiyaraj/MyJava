package com.dallas.sowmiya.tcpclientserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.apache.derby.impl.sql.catalog.SYSROUTINEPERMSRowFactory;

public class TcpClientJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			System.out.println("CLIENT ::client is starting...");
			Socket socket = new Socket("localhost", 6666);
			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("hello server how are you..");
			
			System.out.println("CLIENT ::message sent to server...");
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			String message = dis.readUTF();
			
			System.out.println("CLIENT:: server repley is  "+ message );
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
