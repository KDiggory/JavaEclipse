package com.qa.garageexercise;

public class Car extends Vehicle implements HasWheels, SatNav{ // implements the interface has wheels - is a method you must have in this class. 
																// interfaces are comma separated
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
	public void drive() {
		System.out.println("I drive like a car");
		
	}

	@Override
	public void changeWheels() {
		System.out.println("Change wheels on the car");
		
	}

	@Override
	public void direction() {
		System.out.println("Please take the next left");
		
		
	}

	
	
		


}
