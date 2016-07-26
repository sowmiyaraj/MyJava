package com.dallas.sowmiya.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
public class MainCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //   List<String> myList = new ArrayList<>();
		/**
		 * List 
		 * 1. allows duplicates
		 * 2. allows null
		 * 3. preserves insertion order
		 * 4. allows more than one null
		 */
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("ravi");
		nameList.add("nagamani");
		nameList.add("sowmiya");
		nameList.add(null);
		nameList.add("ravi");
		nameList.add(null);
		
		 //System.out.println("arralist is "+ nameList);
		 for(String name: nameList){
			 //System.out.println("name is "+ name);
		 }
		 
		//System.out.println("size of list is "+ nameList.size());
	/*	String lastElement = nameList.get(2);
		System.out.println("last element is "+ lastElement);
		
		
		Collection<String> myCollection = new ArrayList<>();
		
		Iterable<String > myIterable = new ArrayList<>();
	//	myIterable.
		
		myCollection.*/
		
		ArrayList<Student> myStudentList = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setName("ravi");
		Student s2 = new Student();
		s2.setName("nagmani");
		Student s3 = new Student();
		s3.setName("sowmiya");
		Student s4 = new Student();
		s4.setName("dallas");
		myStudentList.add(s1);
		myStudentList.add(s2);
		myStudentList.add(s3);
		myStudentList.add(s4);
		
		//System.out.println("my student list is "+ myStudentList);
		
		ArrayList<Trainer> myTrainerList = new ArrayList<Trainer>();
		Trainer t1 = new Trainer();
		t1.setName("ravi");
		t1.setSubject("Java");
		myTrainerList.add(t1);
		
		//Iterator<Trainer> trainerIterator = myTrainerList.iterator();
		//while(trainerIterator.hasNext()){
			//System.out.println("trainer is " + trainerIterator.next());
			//trainerIterator.remove();
		//}

		//System.out.println("my trainer list is " + myTrainerList);

        //Vector
		Vector<String> myVector = new Vector<>();
		myVector.add("ravi");
		myVector.add("nags");
		myVector.add("sowmiya");
		myVector.ensureCapacity(50);
		Enumeration<String> vectorEnum = myVector.elements();
		while(vectorEnum.hasMoreElements()){
			System.out.println("this is vector element through enum"+ vectorEnum.nextElement());
		
		}
		//System.out.println(myVector);
		
        //TreeSet
		Set<Student> myTreeSetofStudent = new TreeSet<>();
		
		Student st1 = new Student();
		st1.setName("ravi");
		Student st2 = new Student();
		st2.setName("nagmani");
		Student st3 = new Student();
		st3.setName("sowmiya");
		Student st4 = new Student();
		st4.setName("dallas");
		myTreeSetofStudent.add(st1);
		myTreeSetofStudent.add(st2);
		myTreeSetofStudent.add(st3);
		myTreeSetofStudent.add(st4);
		
		System.out.println(myTreeSetofStudent);
		
	}

}
