package com.qa.AnimalExercise;

public abstract class Animal implements Eats, Habit {
	
	String species;
	String sex;
	int age;
	boolean dangerous;
	
	
	public Animal(String species, String sex, int age, boolean dangerous) {
		super();
		this.species = species;
		this.sex = sex;
		this.age = age;
		this.dangerous = dangerous;
	}

	public void iAm() {
		System.out.println("I am in the animal kingdom, phylym chordata"); 
	}
	
	public void notInsect() {
		System.out.println("I am not an insect"); 
	}
	
	public void hungry() {
		System.out.println("I am hungry, give me food"); 
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + ", sex=" + sex + ", age=" + age + ", dangerous=" + dangerous + "]";
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDangerous() {
		return dangerous;
	}

	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

	 

}
