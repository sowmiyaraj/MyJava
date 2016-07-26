package com.dallas.sowmiya.io;

import java.util.Scanner;

import org.apache.derby.impl.sql.catalog.SYSROUTINEPERMSRowFactory;

public class ConsoleReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		scanner = new Scanner(" the quick borwn fox jumped over lazy dog");
		
		while(scanner.hasNext()){
		
		System.out.println(scanner.next());
		}
		//System.out.println(scanner.delimiter());
	 /*scanner.useDelimiter("\\n");
		
		System.out.println("Enter number");
		int number = scanner.nextInt();
		System.out.println("Number is " + number);
		
		System.out.println("Enter Word");
		String word = scanner.next();
		System.out.println("Word is " + word);
		
		
		
		System.out.println("Enter Msg");
		if(scanner.hasNextLine()){
		String msg = scanner.nextLine();
		System.out.println("Msg is " + msg);*/
		
		
		/*int rowNum;
		int colNum;
		System.out.println("Enter number of rows: ");
		rowNum = scanner.nextInt();
		System.out.println("No.of rows is : " + rowNum);
		
		System.out.println("Enter number of Cols: ");
		colNum = scanner.nextInt();
		System.out.println("No.of cols is : " + colNum);
		
		int[][] matrix = new int[rowNum][colNum];
		
		for(int i=1; i<=rowNum; i++){
			System.out.println("Enter elements of" + i + "row");
			for(int j=1; j<=colNum; j++){
				System.out.println("Enter elements of" + j + "col");	
				int element = scanner.nextInt();
				matrix[i-1][j-1]=element;
				System.out.println("Entered  element is " + element + " at " + (i-1) + " , " + (j-1));
			}
		}
		
		
		for(int i=0; i<rowNum; i++){
			//System.out.println("Enter elements of" + i + "row");
			for(int j=0; j<colNum; j++){
				//System.out.println("Enter elements of" + j + "col");	
				//int element = scanner.nextInt();
				System.out.print(matrix[i][j]);
				System.out.print(" ");
				//System.out.println("Entered  element is " + element + " at " + (rowNum-1) + " , " + (colNum-1));
			}
			System.out.println("");
		}
		
		*/
	}

}
