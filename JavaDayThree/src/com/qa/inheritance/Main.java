package com.qa.inheritance;

public class Main { // this is the class where you will run things

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.meow(); // putting cat. once you have made a new instance of it, you can see all the possible methods from the super class and the subclass
		// only cat will have methods in the subclass --> meow is only in cat subclass, not the super class, so dog doesnt have it.
		// can only have single inheritance --> cant extend more than one class
		// have interfaces for this instead. 
		// can have chains of inheritance, eg if you have a subclass of cat get burmese. 
		
		Siamese si = new Siamese();
		
		si.meow();
		
	}

}
// if classes are related do inheritance, if they aren't then don't!!
// do it if the thing you are making is a
// eg siamese is a cat
