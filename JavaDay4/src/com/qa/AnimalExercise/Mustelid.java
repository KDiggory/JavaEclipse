package com.qa.AnimalExercise;

public class Mustelid extends Animal{
		
	private String fun; // = "Yes";
	
	public Mustelid(String species, String sex, int age, boolean dangerous, String fun) {
		super(species, sex, age, dangerous);
		this.fun = fun;
		
	}

	@Override
	public void diet() {
		System.out.println("I am an omnivore");

	}
	
	@Override
	public void timeOfDay() {
		System.out.println("Sometimes I am nocturnal");
}

	@Override
	public String toString() {
		return "Mustelid [fun=" + fun + ", species=" + species + ", sex=" + sex + ", age=" + age + ", dangerous="
				+ dangerous + "]";
	}

	public String getFun() {
		return fun;
	}

	public void setFun(String fun) {
		this.fun = fun;
	}

	

	
	
	
}

