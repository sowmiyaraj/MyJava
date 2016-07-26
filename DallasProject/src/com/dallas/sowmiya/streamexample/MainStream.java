package com.dallas.sowmiya.streamexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.derby.impl.sql.catalog.SYSROUTINEPERMSRowFactory;

public class MainStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<>();
		myList.add("ravi");
		myList.add("nagamani");
		myList.add("Sowmiya");
		myList.add("brij");
		myList.add("mahesh");
		myList.add("john");
		myList.add("david");
	/*	
		Function<String,String> function = (String a) -> {
			System.out.println("I will convert to upper case--"+ a);
			return a.toUpperCase();
			};
		Predicate<String> predicate = (String a) -> { 
			System.out.println("I will check if length more than 4--"+ a);
			                                  //            if (a.length() > 4)
			                                   //          return true;
			                                    //         return false;
			return a.startsWith("r");
		                                                   
		 };
		*/
		 
		 
		Stream<String > myStream = myList.stream(); 
		 
	//	myList.
		
	//	stream().
		
		
		
		
	/*	myStream.
		
		filter(predicate).
		filter((String s) -> {
		                      if(s.length() > 4 )
		                     return true;
			                 else
			                	return false;   
		                       }
		)
		
		map(function).
	//	map(mapper)
		
		forEach(System.out::println);*/
		
		//myStream.close();
		
	//	myStream.forEach(System.out::println);
		//System.out.println(myList);
          		
	
		/*List<Integer> myIntList = new ArrayList<>();
		myIntList.add(1);
		myIntList.add(2);
		myIntList.add(3);
		myIntList.add(4);
		myIntList.add(5);
		
		Function<Integer,Integer> sqrtFunction = (Integer num) -> {
										int sqrt = num * num;
										return sqrt;
										};
	     long totalCount = myIntList.
	                          stream().
	                          count();
	     
	     System.out.println("long count is "+ totalCount);
	     
	    
	   
	    //map(sqrtFunction).
	    //forEach(System.out::println);
	    System.out.println(myIntList);
		
		Map<String,String> countryMap = new HashMap<>();
		
		countryMap.put("india", "new delhi");
		countryMap.put("china", "beiing");
		countryMap.put("bangaladesh", "dhaka");
		countryMap.put("canada", "ottawa");
		
		System.out.println("before stream operation "+ Thread.currentThread().getName());
		
	   countryMap.keySet()
	   .parallelStream()
	   .map((String a) -> {
		      
		   System.out.println("This is a map operation");
		   System.out.println(Thread.currentThread().getName());
		   return a.toUpperCase();
		   
	   })
	   .filter((k)  -> {
		   System.out.println("This is a filter operation");
		   System.out.println(Thread.currentThread().getName());
		   return k.startsWith("C");
	   })
	   .forEach(System.out::println);
		
		*/
		
		
		Player p1 = new Player("dhoni", 30, 200);	
		Player p2 = new Player("ricky", 35, 300);
		Player p3 = new Player("sehwag", 28, 200);
		Player p4 = new Player("kohli", 25, 150);
		Player p5 = new Player("yuvraj", 31, 25);
		
		Function<Player,Stream<Person>> playerToPersonConverter = (Player player) -> {
			System.out.println("now operating on player "+ player.getName());
		     Person person = new Person();
		     person.setName(player.getName());
		     Set<Person> personSet = new HashSet<>();
		     personSet.add(person);
		     System.out.println("as of now content of person set is "+ personSet);
		     return personSet.stream();
		};
	
		
		Consumer<Person> personConsumer = (Person p )  -> { System.out.println("person is"+ p.getName());};
		
		Set<Player> playerSet = new HashSet<>();
		playerSet.add(p1);
		playerSet.add(p2);
		playerSet.add(p3);
		playerSet.add(p4);
		playerSet.add(p5);
		
		
		playerSet
		.stream()
		.flatMap(playerToPersonConverter)
		.forEach(personConsumer);

	}

}
