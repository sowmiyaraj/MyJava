package com.dallas.sowmiya.interfaceExample;

public interface SmoothFig {
    void drawSmoothFig();
    default void co_ordinates(){
   	 System.out.println("Printing Co-ordinates !!!");
    }
    static void three_d(){
   	 System.out.println("This shape is in 3 dimension !!!");
    }
}
