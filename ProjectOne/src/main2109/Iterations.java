package main2109;



public class Iterations {
	
	//ITERATIONS
	

	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		System.out.println(10); // very inefficient to do it this way --> use iterations instead! 
	//}
		// Basic for loop -- most common one you will use and come across.
		//public static void forLoop(int count) {
			//for(int i = 0; i < count; i++)
				//System.out.println(i); } 
		
		
		// for (  variable;  condition; do what) need to increase counter else you get stuck in an infinite loop
		for(int i = 0; i <= 10; i ++) { // i stands for iteration
			System.out.println(i);} // prints out 0 - 10
		System.out.println("\n -------------------------------------\n"); 
	
	// can also have nested for loops - useful when doing arrays
	
	// While loops
	int i = 0; // need to initialise i before using it in the while loop
		while(i <= 20) {
			System.out.println(i);
			i++;
		}
		System.out.println("\n -------------------------------------\n"); 
		
		// Do while loop
		// do while loop will always run the loop at least once, even if the condition is already met when started. The do runs before the while.
		int doCount = 21; // set up the variable first
		do {
			System.out.println("Doing this " + doCount + " times");
			doCount++;
		} while(doCount <= 23);
		System.out.println("\n -------------------------------------\n"); 
		}

}

