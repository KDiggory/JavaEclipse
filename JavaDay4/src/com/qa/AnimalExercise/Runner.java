package com.qa.AnimalExercise;


public class Runner {
	
	public static void main(String[] args) {
		Animal ferret = new Mustelid("Mustela furo", "Female", 3, false, "Very");
		Animal panda  = new Ursine("Ailuropoda melanoleuca", "Male", 5, true);
		Animal wolf = new Canine("Canus lupus", "Female", 6, true);
		Animal houseCat = new Feline("Felus catus", "Male", 9, false);
		
		System.out.println("Are ferrets dangerous? " + ferret.dangerous);
		System.out.println("Are ferrets fun? " + ((Mustelid) ferret).getFun());
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println(ferret.toString()); 
		System.out.println(panda.toString()); 
		System.out.println(wolf.toString()); 
		System.out.println(houseCat.toString()); 
		
		System.out.println("--------------------------------------------------------------------");
		
		panda.hungry(); 
		((Feline) houseCat).hungry(); 
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("Wolf says: ");
		((Canine) wolf).diet();
		((Canine) wolf).iAm();
		wolf.hungry();
		System.out.println("Panda says: ");
		panda.iAm();
		panda.diet();
		panda.notInsect();
		
		
		
		System.out.println("--------------------------------------------------------------------");
		
		Animal ferret2 = new Ferret("Mustela furo", "Female", 3, false, "Very");
		Animal badger = new Badger("Badger", "Female", 0, true, null);
		System.out.println(ferret2.toString());
		System.out.println(badger.toString());
		System.out.println("Are ferrets fun? " + ((Ferret) ferret2).getFun());
		System.out.println("Are badgers fun? " + ((Badger) badger).getFun());
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("Badger says: ");
		badger.timeOfDay();
		
		System.out.println("Ferret says: ");
		ferret2.timeOfDay();
		
		System.out.println("--------------------------------------------------------------------");
		
		Animal panda2  = new Panda("Ailuropoda melanoleuca", "Female", 9, true);
		System.out.println("Panda says: ");
		panda2.iAm();
		panda2.diet();
		panda2.notInsect();
		
		
		
	}

}
