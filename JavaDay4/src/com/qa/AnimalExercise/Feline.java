package com.qa.AnimalExercise;

public class Feline extends Animal{
	
	

	public Feline(String species, String sex, int age, boolean dangerous) {
		super(species, sex, age, dangerous);
		
	}

	@Override
	public void diet() {
		System.out.println("I am carnivore");
}

	@Override
	public void timeOfDay() {
		System.out.println("Sometimes I am nocturnal");
}

	@Override
	public String toString() {
		return "Feline [species=" + species + ", sex=" + sex + ", age=" + age + ", dangerous=" + dangerous + "]";
	}
	
	@Override
	public void hungry() {
		System.out.println("I am hungry, give me food! But it had better be nice or I wont eat it"); 
}
}
