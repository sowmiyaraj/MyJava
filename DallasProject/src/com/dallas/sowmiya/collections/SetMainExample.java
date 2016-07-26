package com.dallas.sowmiya.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		/*
		 * 1.hashset
		 * 2.treeset
		 * 3linkedhashset
		 * 
		 */
		Set<String> mySet = new HashSet<>();
		mySet.add("ravi");
		mySet.add("ravi");
		mySet.add("sowmiya");
		mySet.add("nagmani");
		mySet.add(null);
		mySet.add(null);
		System.out.println(mySet);
		
		Set<String> myTreeSet = new TreeSet<>();
		myTreeSet.add("ravi");
		myTreeSet.add("ravi");
		myTreeSet.add("sowmiya");
		myTreeSet.add("nagmani");
		myTreeSet.add("arvind");
		//myTreeSet.add(null);
		//myTreeSet.add(null);
		 System.out.println(myTreeSet);
		 
			Set<String> myLinkedHashSet = new LinkedHashSet<>();
			myLinkedHashSet.add(null);
			myLinkedHashSet.add("ravi");
			myLinkedHashSet.add("ravi");
			myLinkedHashSet.add("sowmiya");
			myLinkedHashSet.add("nagmani");
			myLinkedHashSet.add("arvind");
			myLinkedHashSet.add(null);
			//myTreeSet.add(null);
			//myTreeSet.add(null);
			 System.out.println(myLinkedHashSet);
	}   

}
