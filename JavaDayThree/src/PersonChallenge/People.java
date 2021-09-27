package PersonChallenge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;



public class People {
	
	ArrayList<Person> personList = new ArrayList<>();
	public personList = {}; 
	
	// trying to put the different objects into the list
	// use the .add method 
	personList.add(Runner.Katie);
	personList.add(Runner.George);
	personList.add(Runner.Huxley);
	personList.add(Runner.Oswin);
	
	
		// search for objects in the list by name
	public Person search(String name) { // can set return type as a specified type of object -- less ambiguous. 
		for (int i =0; i < personList.size(); i++) {
		if (personList.contains("Katie")) {
			System.out.println(personList[i]);
		} else {
			System.out.println("They are not in the array list");
		
			}
		}
		
		// loop through array to find specific instance of the name we are looking for
		
		// once found index - return it at that index
		
		return Person;
		
		
	}
	
	
	
	
}

	

