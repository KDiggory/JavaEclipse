package com.qa.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Runner {

	public static void main(String[] args) {
	/// hash maps	
		
		Map<Integer, String> myMap = new HashMap<>(); // make a new empty hash map with they keys as integers and the cvalues as strings
		
		myMap.put(1, "Katie"); // add things to the hash map
		myMap.put(2, "George");
		myMap.put(3, "Huxley");
		myMap.put(4, "Oswin");
		
		System.out.println(myMap.get(4)); // prints out oswin as that is the value with the key 4
		
		
		System.out.println( myMap.isEmpty()); // lots of methods available to use!
		// myMap.clear();
		System.out.println(myMap.keySet()); // prints out all the keys
		System.out.println(myMap.values()); // prints out all the values
		System.out.println(myMap.entrySet()); // prints it all out 
		System.out.println(myMap.toString()); // slightly different to entry set as is in curly brackets
		
//// hash sets
		Set<Integer> nums = new HashSet<>(); // a hashset has a hash map behind the layout/facade. 
											  // everything you add into your hash set gets a key added as well - the key is a hash code.
											  // doesn't allow for duplicate entries - can't have the same entry as they would have the same hash code.
	// could use with emails or bank account numbers as no 2 people will have the same one. 
		
		nums.add(1); /// Adds to the hash set
		nums.add(50);
		nums.add(4501);
		nums.add(23);
		nums.add(5);
		nums.add(4567);
		nums.add(667);
		nums.add(33);
		nums.add(33); // if you input the same one again it overwrites the previous one
		
		// can iterate through collections using iterator objects. Don't need to use for loops
		Iterator<Integer> iterator = nums.iterator(); // need to initialise iterator and it needs to have the same type as the hash set
		System.out.println(iterator.next());
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); // this sorts by the hashcode - so won't be the same as what you input
		}		// the hashcode for integers is actually just the integer - but the ordering seems to be a bit funny that we aren't sure about.
		// Why use sets? for cases where you don't care what order the information is stored in and they have to be unique
		
		Set<String> strings = new HashSet<>();
		
		strings.add("Hello");
		strings.add("bye");
		strings.add("hello");
		
		
		for(String string : strings) {
			System.out.println(string.hashCode()); // prints out the hash code for the strings. 
			
		}
	
	}

}
