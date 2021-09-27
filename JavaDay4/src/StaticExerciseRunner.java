
public class StaticExerciseRunner {

	public static void main(String[] args) {
		
		
	System.out.println(Dog.legs);	// now that numLegs is static you dont need to instantiate it before calling that variable
	Dog.bark(); // like the variable, the instance doesnt need to be instantiated before you call the method
	//Dog dog = new Dog();  // instantiating an instance of the class Dog
	
	int rand = (int)(Math.random()*100);
	System.out.println(rand);
	
	Math.random(); // this doesnt do anything
	
	
	Math math = new Math(); // this is not visible - its a global variable and has a provate constructor. You can't change anything because it is private.
	// all of the methods in it will be static so that you can use them.
	
	}

}
