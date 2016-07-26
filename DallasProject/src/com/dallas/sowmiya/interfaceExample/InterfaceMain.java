package com.dallas.sowmiya.interfaceExample;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape.length = "40";
		Triangle triObj = new Triangle();
		triObj.draw();
		triObj.co_ordinates();
		System.out.println(Shape.length);
		Shape shaObj1 = new Triangle();
		Shape shaObj2 = new Circle();
		shaObj1.draw();
		shaObj2.draw();
		
	}

}
