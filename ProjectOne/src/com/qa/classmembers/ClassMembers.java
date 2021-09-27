package com.qa.classmembers;

public class ClassMembers {

	public static void main(String[] args) { // HAVE to have a main method!! 
		// TODO Auto-generated method stub

		// Reference variables are objects constructed through the use of classes.
		// initialising a class brings it to life.
		// This is because Java is object oriented. A class is like a blueprint - it has all the details and requirements to build
		
		//STUDENT
		//VARIABLES
		
		String name; // this is the option to leave it blank if you dont want to set them all with the same default name
		String name = "Bob"; // this sets it as a name
		byte age;
		double height; 
		long studentID = (long)(Math.random() * 1000000); // this gets us a random number and multiplies it to make it bigger 
		boolean highIQ = false; 
		
		
		// METHODS
		// methods follow a certain pattern like main method
		public void doHomeWork() {
			System.out.println("I'm doing my homework");
		}
		public int addNumbers(int x, int y) {
			int z = x + y; // int z only exists in this method
			System.out.println(z);
			
			return z; 
			}
		
		public int subtractNumbers(int x, int y) {
			int z = x - y; // int z only exists in this method
			System.out.println(z);
			
			return z;
		}
		public int timesNumbers(int x, int y) {
			int z = x * y; // int z only exists in this method
			System.out.println(z);

}
		public int divideNumbers(int x, int y) {
			int z = x / y; // int z only exists in this method
			System.out.println(z);
		}
		
		public int moduloNumbers(int x, int y) {
			int z = x % y; // int z only exists in this method
			System.out.println(z);
		}
		
		
	}
		

