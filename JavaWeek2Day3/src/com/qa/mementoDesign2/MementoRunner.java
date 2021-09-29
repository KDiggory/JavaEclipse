package com.qa.mementoDesign2;

public class MementoRunner {

	public static void main(String[] args) {
		
		Originator originator = new Originator(1, "My Data");
		Caretaker caretaker = new Caretaker();
		
		
		originator.setContent("This is the original content");      //original content
        System.out.println(originator);
        Memento memento = originator.createMemento();   //created Memento object --> memento
        caretaker.add(originator.createMemento()); 		// saved the memento to the caretaker ArrayList
        
        originator.setContent("This is new content");      //changed content
        originator.setId(2);							// change the id of the changed object
        caretaker.add(originator.createMemento()); 	     // saved the memento to the caretaker ArrayList
        System.out.println(originator);
         
        originator.setContent("This is more new content");      //changed content again
        originator.setId(3);									// change the id of the changed object
        caretaker.add(originator.createMemento()); 				// saved the memento to the caretaker ArrayList
        System.out.println(originator);
        
        originator.restore(caretaker.get(1));       //UNDO change back one step
        System.out.println(originator);    //original content from memento 2
        
        originator.restore(caretaker.get(0));       //UNDO change to the start
        System.out.println("Current id: " + caretaker.get(2).toString());  // this just prints out the location. why?
        System.out.println(originator);    //original content from original memento
		

	}

}
