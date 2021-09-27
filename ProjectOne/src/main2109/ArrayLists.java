package main2109;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
	
	//Array lists - uses wrapper classes
	ArrayList<Integer> integers = new ArrayList<>(); // can do it like this but.. 
	List<Integer> integers2 = new ArrayList<>(Arrays.asList(1,2,3,4,5)); // better way to initialise array list
	
	integers.add(1);
	integers.add(2);
	
	System.out.println(integers.get(0)); // now instead of explicitly interacting with an array - where we pick the index we want and get that record, we interact using methods. 
	integers.set(0, 4);
	
	System.out.println(integers.get(0)); // sets index 0 to 4 instead of 1
	
	integers.set(1, 14); // sets the number at position 1 to 14 - you have to do integers.add(2) before this will work - add a position 2 or it will be out of bounds
	System.out.println(integers.get(1)); // 
	
	integers2.set(1, 3); // changes the number at index 1 to 3
	System.out.println(integers2.get(1)); // then prints that
	
	System.out.println(integers.size()); // prints 2
	System.out.println(integers2.size()); // prints 5
	
	
	// looping through an array list
	
	for(int i = 0; i < integers2.size(); i++ ) {
		System.out.println(integers2.get(i)); // this prints the contents of the array
	}
	
	// Tons of methods available for integer lists - practice to see what they can do. 
	// integers. 
	
		

	}

}
