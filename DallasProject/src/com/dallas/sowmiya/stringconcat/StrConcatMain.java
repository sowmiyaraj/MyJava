package com.dallas.sowmiya.stringconcat;

/* String Concatination - 5th May 2016
 *  String builder = not thread safe (example: mobile programing)
 *  String buffer = Thread safe. When dealing with big files on a server
 *  Array integers - length function myarray.length
 *  Arrays 2D arrays.
 */
 
public class StrConcatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "India";
		String str2 = "is";
        String str3 = "my";
        String str4 = "country";
        
        int[] myArray1 = new int[5];
        int[] myArray2 = {10,20,30,40,50};
        System.out.println(myArray1.length);
        System.out.println(myArray2.length);
        //myArray2[5]=60; example for ArrayIndexOutOfBoundsException
        
        for(int arrayele:myArray2){
        	System.out.println(arrayele);
        }
        
        int myvar=9;
        int[][] myArray = new int[3][3];
        for(int rowin=0;rowin<3;rowin++){
        	for(int colin=0;colin<3;colin++){
        		myArray[rowin][colin]=myvar;
        		myvar--;
        	//	System.out.println(myvar);
        	}
        }
        for(int rowin=0;rowin<3;rowin++){
        	for(int colin=0;colin<3;colin++){
        	System.out.print(myArray[rowin][colin]);
        	System.out.print(" ");
        	}
        	System.out.print("\n");
        }
        
        String str5 = str1 + str2 + str3 + str4;
        StringBuilder strbuilder = new StringBuilder();
        strbuilder.append(str1).append(str2).append(str3).append(str4);
        System.out.println("Concatinated string is : " + str5);
        System.out.println("Concatinated string is : " + strbuilder);
        StringBuffer strbuffer = new StringBuffer();
        strbuffer.append(str1).append(str2).append(str3).append(str4);
        System.out.println("Concatinated string is : " + strbuffer);
	}

}
