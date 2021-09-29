package com.qa.garageexercise;

public class Car extends Vehicle{
	
	boolean isofix = true;
	
	public Car(String make, String model, int wheels, float engineSize,
			String catag, boolean isofix) {
		super(make, model, wheels, engineSize, catag); // use super so you can pass in the variables from the superclass
		isofix = true;
	}
	
	public void vroom() {
		System.out.println("Vrooooooom");
	}

	@Override
	public String toString() {
		return "Car [isofix=" + isofix + ", make=" + make + ", model=" + model + ", wheels=" + wheels + ", engineSize="
				+ engineSize + ", catag=" + catag + "]";
	}

	@Override
	public int bill() {
		return 1000;
	}

	
	// to string method means you can get data to console instead of the location of the information
	 // can also put super in here
		


}
