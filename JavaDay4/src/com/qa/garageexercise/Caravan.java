package com.qa.garageexercise;

public abstract class Caravan extends Vehicle implements HasWheels{
	
int berth = 6;

	public Caravan(String make, String model, int wheels, float engineSize,
			String catag, int berth) {
		super(make, model, wheels, engineSize, catag);
		
	}

	@Override
	public String toString() {
		return "Caravan [berth=" + berth + ", make=" + make + ", model=" + model + ", wheels=" + wheels
				+ ", engineSize=" + engineSize + ", catag=" + catag + "]";
	}

	
	@Override
	public void drive() {
		System.out.println("I drive slowly");
	
	
	

}

	@Override
	public void changeWheels() {
		System.out.println("I have 2 small wheels to change");
		
		
	}
	@Override
	public void direction() {
		System.out.println("Please take the next left");
}
}