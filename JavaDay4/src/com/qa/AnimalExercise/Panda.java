package com.qa.AnimalExercise;

public class Panda extends Ursine{

	public Panda(String species, String sex, int age, boolean dangerous) {
		super(species, sex, age, dangerous);
		
	}
	
	@Override
	public void diet() {
		System.out.println("I am very strictly a herbivore, despite having a carnivores digestive tract. Bamboo only please");

	}

}
