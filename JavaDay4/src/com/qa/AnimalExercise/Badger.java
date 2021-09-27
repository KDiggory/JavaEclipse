package com.qa.AnimalExercise;

public class Badger extends Mustelid {
	

	
	

	private String fun;

	public Badger(String species, String sex, int age, boolean dangerous, String fun) {
		super(species, sex, age, dangerous, fun);
		 this.fun = "No, I am grumpy";
		 
		
	}
	
	@Override
	public void timeOfDay() {
		System.out.println("I am nocturnal");

}
}