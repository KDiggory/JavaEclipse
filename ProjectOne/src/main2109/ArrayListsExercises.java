package main2109;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.collections; 

public class ArrayListsExercises {

	public static void main(String[] args) {
		List<Integer> ArrayList = new ArrayList<>(Arrays.asList(17,19,21)); // make an array list. Can add numbers here if wanted too 
		ArrayList.add(0,1); // add several elements. Can only add one at a time. These are added at the index, pushing the values that were in there already to the end. 
		ArrayList.add(1,3);
		ArrayList.add(2,5);
		ArrayList.add(3,7);
		ArrayList.add(4,9);
		ArrayList.add(5,11);
		ArrayList.add(6,13);
		ArrayList.add(7,15);
		
		System.out.println(ArrayList); // print out the entire array list
		
		
	// iterate through the array list and print out each element ( with both normal and enhanced for loops!
		System.out.println("Normal for loop:");
		for(int i = 0; i < ArrayList.size(); i++ ) {
			System.out.println(ArrayList.get(i)); // this iterates through and prints the contents of the array 
			
		}
		System.out.println("Enhanced for loop:");
		for(int num: ArrayList) {
			System.out.println(num);
		}	
		
		// get specific elements
		int one = ArrayList.get(1); // sets the value at index 1 to a variable which can then be printed
		System.out.println(one);
		
		//set specific elements
		ArrayList.set(0,  100);
		System.out.println(ArrayList.get(0));
		
		// remove specific elements
		ArrayList.remove(0);
		System.out.println(ArrayList);
		
		//From the collections class:
		// sort the list
		Collections.sort(ArrayList);
		System.out.println(ArrayList); // sorts it numerically - but mine is already
	
		//reverse the list
		Collections.reverse(ArrayList); // reverses the sort
		System.out.println(ArrayList);
		
		// swap
		Collections.swap(ArrayList, 1, 5); // swaps the values at 2 positions (if they are the same it wont
		System.out.println(ArrayList);
		
		// clone
		

	}

}
