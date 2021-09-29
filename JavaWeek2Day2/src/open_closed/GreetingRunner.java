package open_closed;

public class GreetingRunner {
	
	public static void main(String[] args) {
		 Greeting casual = new CasualGreeting();
		 String casualGreet = casual.greet();
		 System.out.println(casualGreet);
		 
		 Greeting normal = new NormalGreeting();
		 String normalGreet = normal.greet();
		 System.out.println(normalGreet);
		 
		 Greeting formal = new FormalGreeting();
		 String formalGreet = formal.greet();
		 System.out.println(formalGreet);
		 
		 Greeter newGreeter = new Greeter(formal);
		 newGreeter.getGreeting();
		 String test = newGreeter.greet();
		 System.out.println(test);
		
		 newGreeter.setGreeting(normal);
		 String test2 = newGreeter.greet();
		 System.out.println(test2);
		

	    }

}
