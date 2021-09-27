package com.qa.classmembers;

public class Zoo {

	static String animalName; 
	static char type; // M R or B
	static int age;
	static float weight;
	static boolean canFly; 
	static boolean canSwim; 
	static String noise;



	public Zoo(char type, int age, float weight, boolean canFly, boolean canSwim, String noise) {
		this.type = type;
		this.age = age;
		this.weight = weight;
		this.canFly = canFly;
		this.canSwim = canSwim;
		this.noise = noise;
	}
	

	public void Fly() {
		if (canFly == true) {
		System.out.println("This animal can fly");
		}
		else {
			System.out.println("I cant fly :( "); 
		
	} }
	
	public static void Speak() {
		System.out.println("I make this noise: " + noise );
	}
	
	public static void Eat() {
		System.out.println("I am hungry!");
	
	}
	
	public static void Swim() {
		if (canSwim == true) {
			System.out.println("This animal can swim");
		}
			else {
				System.out.println("This animal can't swim!");
			}
		}
	}
		
		


