package com.dallas.sowmiya.collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/*
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("arvind", 5);
		myMap.put("mohan", 45);
		myMap.put("ram", 77);
		myMap.put("david", 99);
		System.out.println(myMap);
		
		Map<String, String> myMapStr = new HashMap<>();
		myMapStr.put("Sowmiya", null);
		myMapStr.put(null, "Kashyap");
		myMapStr.put("Ravi", "Prakash");
		myMapStr.put("Praveen", "Joe");
		myMapStr.put("Anha", null);
		System.out.println(myMapStr);
		*/
		//System.out.println("value for key ravi is "+ myMapStr.get("Ravi"));
	  
		
		/*Set<String> myMapKeySet = myMapStr.keySet();
		for(String key : myMapKeySet){
			System.out.println("key "+ key + " value " + myMapStr.get(key));
		}
		*/
		 //Map<String,String> myLinkedMap = new LinkedHashMap<>();
		 
		 /* myLinkedMap.put("ravi", "prakash");
		  myLinkedMap.put("india", "delhi");
		  myLinkedMap.put("australia", "canberra");
		  myLinkedMap.put("ravi", "bangalore");
		  myLinkedMap.put(null, "bangalore");
		  System.out.println("my linked hash map is"+ myLinkedMap);*/
		  
		 /* Map<String,String> myTreemap = new TreeMap<>();
		  myTreemap.put("ravi", "prakash");
		  myTreemap.put("india", "delhi");
		  myTreemap.put("australia", "canberra");
		  myTreemap.put("ravi", "bangalore");
		  //myTreemap.put(null, "bangalore");
		  System.out.println("my tree  map is"+ myTreemap);
		 */ 
		 
		 College colObj1 = new College();
		 colObj1.setName("IIM");
		 colObj1.setYearOfStarting(2009);
		 
		 College colObj2 = new College();
		 colObj2.setName("IIT");
		 colObj2.setYearOfStarting(2013);
		 
		 College colObj3 = new College();
		 colObj3.setName("IISc");
		 colObj3.setYearOfStarting(2011);
		 
		 Map<College,String> myCollegeMap = new TreeMap<>();
		 myCollegeMap.put(colObj1, "A");
		 myCollegeMap.put(colObj2, "B");
		 myCollegeMap.put(colObj3, "C");
		 
		 System.out.println("my college tree is " + myCollegeMap);
		 
		 java.util.Iterator<College> myCollegeIter = myCollegeMap.keySet().iterator();
		 while(myCollegeIter.hasNext()){
			
			 myCollegeIter.next();
			 
			 System.out.println("there are more elements in this collegeiter...");
			 myCollegeMap.put(colObj1, "K");
			 
		 }
		
		 
		 
	}

}
