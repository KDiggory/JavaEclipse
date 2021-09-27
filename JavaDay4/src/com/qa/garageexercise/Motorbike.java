package com.qa.garageexercise;

public abstract class Motorbike extends Vehicle implements HasWheels{
	
	boolean dangerous = true;

	public Motorbike(String make, String model, int wheels,
			float engineSize, String catag, boolean dangerous) {
		super(make, model, wheels, engineSize, catag);
		
	}

	@Override
	public String toString() {
		return "Motorbike [make=" + make + ", model=" + model + ", wheels=" + wheels + ", engineSize=" + engineSize
				+ ", catag=" + catag + " dangerous=" + this.dangerous + "]";
	}

	@Override
	public void drive() {
		System.out.println("I drive dangerously");
}

	@Override
	public void changeWheels() {
		System.out.println("I have 2 wheels to change");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void direction() {
		System.out.println("Please take the next left");
}
}

