package com.dallas.sowmiya.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> myLinkedList = new LinkedList<>();
		myLinkedList.add("ravi");
		myLinkedList.add("sowmiya");
		myLinkedList.add("nagmani");
		myLinkedList.add("mohan");
		System.out.println(myLinkedList.poll());
		System.out.println(myLinkedList);
      
		
		Queue <String> myQueue = new LinkedList<>();
		myQueue.add("india");
		myQueue.add("mohan");
		myQueue.add("priya");
		System.out.println(myQueue);
		
		
		/*Deque<String> myDequeue = new ArrayDeque<>();
		myDequeue.*/
		
	}

}
