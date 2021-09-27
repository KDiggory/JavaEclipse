package com.qa.model;

public class Car { 
	
	// This is the blueprint
	private int numOfWheels; // public = it can be accessed from other packages. The default means it is only accessible from the same package. 
	private String make;		// private means it cant be accessed outside of the package! Means they cant be changed. Private class members cant be viewed or changed. 
	private String model;
	private String colour;
	private boolean hasSunRoof;
	
	// This is the constructor - runs when you make an instance of a class. 
	// constructor is used to instantiate a new instance
	//needs to be public and have the same name as the class
	// can be empty - default constructor
	
	// This is the all args constructor
	public Car(int numOfWheels, String make, String model, String colour, boolean hasSunRoof) { // constructor needs to be public so that other classes can access it
		this.numOfWheels = numOfWheels; // saying this. it refers to the current instance of the object we are working with. Like self in python. 
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.hasSunRoof = hasSunRoof;
	}
	// Can also make a constructor by right click, fields, and then generate constructor. 
		// Can have multiple constructors - for if you don't know one of the fields. 

	public Car() { // empty one in case you dont know fields - Default constructor
		super(); // super is for where you inheriting form. If you want the class members from another object.  Not used today
		//
	}
	

	// if you had 2 constructors with the same amount of arguments when  you make an instance you can choose which constructor to make. 

	
	// These are the getters and setters! Means you can access and set them from another package - instead of direct access as they are private. 
	// Auto generated. 
	// getters and setters are really useful but you might not want people to be able to change them - read only means just use getters. See but not written to!!
	// would need to set those variables in a constructor. 
	// All about mitigating risk - people will always find a way --> more so other developers working on your code change things accidentally. No accidental overwriting. 
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isHasSunRoof() {
		return hasSunRoof;
	}

	public void setHasSunRoof(boolean hasSunRoof) {
		this.hasSunRoof = hasSunRoof;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}


	
	
	

	
	
	
	
	
	// ENCAPSULATION - takes away direct access to our class variables
	// use getters and setters - so you can get the data, or set it
}
