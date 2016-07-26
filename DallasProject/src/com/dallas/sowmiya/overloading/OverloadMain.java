package com.dallas.sowmiya.overloading;

import java.io.FileNotFoundException;

/**
 * this is overloadig example
 * @author user
 *
 */
public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void read(String subname) throws Exception{
		System.out.println("Reading ..." + subname);
	}
	void read(String subname) throws FileNotFoundException{
		System.out.println("Reading ..." + subname);
	}

}
