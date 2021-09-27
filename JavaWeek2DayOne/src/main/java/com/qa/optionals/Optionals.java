package com.qa.optionals;

import java.util.Optional;

public class Optionals{

	public static void main(String[] args) {
		Optional<String> optionaName = Optional.ofNullable(name()); // optional is quite like using a maybe conditional
		System.out.println(optionaName.isEmpty()); // can use things like this to check entries in our database. 
	}
	public static String name() {
		String name = "Katie";
		if(name.length() >= 5) {
			return name; 
			} else {
		return null;
		}
	}
}

//Optionals
//---------
//Essentially a way to 
//If we are interacting with a database and we want to update an entry in the database. We want to change id3, but id3 doesn't exist. This will throw an error.
//
//You can use an optional like a conditional, if this exists in the database then do this thing. 
//
// Optionals will make more sense when using springboot