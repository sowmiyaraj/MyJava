package com.dallas.sowmiya.tcpclientserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class TcpServerJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		ServerSocket serverSocket = new ServerSocket(6666);
		
		
		System.out.println("SERVER::server has started.....");
		Socket socket = serverSocket.accept();
		
		
		System.out.println("SERVER::server received a message");
		
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		
		String message = dis.readUTF();
		
		System.out.println("SERVER::mesSage from client is "+ message);;
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		dos.writeUTF(message.toUpperCase());
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
