package main2109;



public class Arrays {

	// An array is a list of things
	// 
	//
	//
	
	
	public static void main(String[] args) {
		int[] numArray ; // created an empty array. ~~~~~ 3 ways to initialise arrays ~~~~~
		int[] numArray2 = {1,3,4,8,10};	// define with square brackets but put data in with curly	
		int[] numArray3 = new int[10]; // this creates an array of the size 10 - populated with default values which will be 0. Can't be resized after, would need an array list if you wanted to do that. 
		// arrays are indexed, they start at 0
		System.out.println(numArray2[3]); // prints the number at position 3 which is number 8
		System.out.println(numArray3[9]); // will print 0 as numArray 3 is filled with 0s when made
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// changing the value in an array
		numArray3[5] = 200; // sets index 5 to 200
		System.out.println(numArray3[5]); // then prints index 5 to check it has been changed. 
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//Multidimensional arrays
		
		int[][] multiArray1;
		int[][] multiArray2 = {{1,2,3,4,5}, {6,7,8}, {9,10,11}} ;	//comma separate the arrays and put them all in curly brackets. this can make multidimensional arrays of varying lengths. 
		int[][] multiArray3 = new int[2][4];// this can only make balanced multidimensional arrays. Will make 2 arrays each with 4 positions.
		
		//getting the data from multiarrays
		System.out.println(multiArray2[2][2]); // the first 2 selects the array at position 2, the second selects the number in array position 2 (Array 3) at position 2 --> number 11
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// looping through an array to get the contents
		for(int i = 0; i < 5; i++ ) {
			System.out.println(numArray2[i]); // this prints the contents of the array
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int j = 0; j < numArray2.length; j ++) { // prints the array if you dont know the length of the array - eg if its really long
			System.out.println(numArray2[j]);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int j = 0; j < numArray2.length; j ++) { // prints the array if you dont know the length of the array - eg if its really long
			System.out.println(numArray2[j] * 2 ); // will print out each * 2
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	// looping through multidimensional arrays
		for(int i = 0; i < multiArray2.length ; i++) {
			for(int j = 0; j < multiArray2[i].length ; j++) {
				System.out.println(multiArray2[i][j]); // prints each array like we want :)
		}
		}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~Enhanced for loop ~~~~~~~~~~~~~~~~~~~~~~");
			// enhanced for loops - more concise way of looping through an array. Use a regular for loop if the incrementor needs to be used elsewhere in the block of code. 
			for(int num: numArray2) {
				System.out.println(num);
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			// enhanced for loop for the multidimensional array
			
			for(int[] array : multiArray2) { // have the square brackets after int because you are looping through the array
				for(int num : array) {
					System.out.println(num);
				}
			}

			
		
		
		}
}
	

	
	
	

