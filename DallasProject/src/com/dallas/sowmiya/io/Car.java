package com.dallas.sowmiya.io;

import java.io.Serializable;


//marker interface
public class Car  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7846350045575022955L;
	private String modelName;
	private int number;
	public String getModelName() {
		return modelName;
	}
	public void setModelname(String modelName) {
		this.modelName = modelName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
