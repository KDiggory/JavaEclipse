package com.qa.AnimalExercise;

public class Ferret extends Mustelid {

	public Ferret(String species, String sex, int age, boolean dangerous, String fun) {
		super(species, sex, age, dangerous, fun);
		
	}
	
	@Override
	public void timeOfDay() {
		System.out.println("I am awake when I want to play but sleep a lot");

}
}
