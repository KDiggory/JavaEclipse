package PersonChallenge;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	
	public static void main(String[] args) {
		
		List<Object> personList = new ArrayList<Object>();
		personList.add(new Object(People.main(Katie)));
		System.out.println(personList);

	}

}
