package com.qa.classmembers;

public class Zooexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo flamingo = new Zoo('B', 4, (float) 12.0, true, false, "skwaaaaak!!!");
		
flamingo.Fly();
flamingo.Eat();
flamingo.Speak();
flamingo.Swim();
System.out.println("The flamingo is " + flamingo.age + " years old. It weighs " + flamingo.weight +"kg." + " Flamingos are birds, birds starts with a " + flamingo.type);

Zoo bear = new Zoo('M', 12, (float) 150.5, false, true, "Grrrrrr");

bear.Fly();
bear.Eat();
bear.Speak();
bear.Swim();
System.out.println("The bear is " + bear.age + " years old. It weighs " + bear.weight +"kg." + " Bears are mammals, mammal starts with an " + bear.type);


	}
	

}


// this now works :) 