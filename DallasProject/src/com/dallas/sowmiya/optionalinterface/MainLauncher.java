package com.dallas.sowmiya.optionalinterface;

import java.util.Optional;

public class MainLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student sObj = new Student();
		
		//sObj.setNameOfStudent("mohan");
		
		Optional<String> sName = Optional.ofNullable(sObj.getNameOfStudent());
		Optional<Integer> sAge = Optional.of(35);
		System.out.println(sName.get());
		
		
		
		
		if(sName.isPresent()){
		System.out.println("name of student is "+sName.get());
		}
		else{
			System.out.println("student name is not set..");
		}
	}

}
