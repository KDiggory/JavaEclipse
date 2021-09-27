package main2109;



public class FlowchartsIterations {
	
	public static void chart() {
		for(int A = 100; A <=200; A++) {
			System.out.println("\t" + A);
		}
	}
		
			
	public static void chart2() {
		int A = 100;
		while (A <= 200) {		// can't get this to work with a for loop
		while (A % 2 ==0) { // nested while loops
			System.out.println("\t -");
			A++;
		}
			while (A % 2 !=0) {
				System.out.println("\t *");
				A++;
			}
		}
		
		public static void chart2ForLoop() {
			for(int A = 100; A <= 200; A++) { // not sure why this isnt working but thats how you would do it with a for loop
				if (A%2 == 0) {
					System.out.println("-");
				} else {
					System.out.println("*");
				}
			}
		}
		
		System.out.println("\t End");} // this prints end after its gotten to 200
	
	public static void printNum() {
		for(int i = 1; i <= 10; i++) { // this works :) nested for loop 
		
		for(int j = 1; i <= 10; j ++) { 
			System.out.println(j); // if you put this print statement as i not j it would print 1 ten times, then 2 ten times etc
		}}
		
	}
	public static void printNum2() { // needs to print the number, the number of times that it is 
		for(int i = 1; i <= 10; i++) { // this works :) nested for loop 
			
			for(int j = 1; j <= i ; j ++) { 
				System.out.println(i); 
			}}
	}
	
	
	
	public static void main(String[] args) {
		chart();
		chart2();
		printNum();
		printNum2();
		chart2ForLoop();
		
		
	}

}
