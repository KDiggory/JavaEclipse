package com.qa.AnimalExercise;

public class Canine extends Animal {

	public Canine(String species, String sex, int age, boolean dangerous) {
		super(species, sex, age, dangerous);
		
	}
	@Override
	public void diet() {
		System.out.println("I am an omnivore");
}
	@Override
	public void timeOfDay() {
		System.out.println("Sometimes I am nocturnal");
}
	
	

}
