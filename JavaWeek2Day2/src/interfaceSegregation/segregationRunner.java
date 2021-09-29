package interfaceSegregation;

public class segregationRunner {
	
	public static void main(String[] args ) {
		Dodo dodo = new Dodo();
		dodo.goExtinct();
		System.out.println(dodo.getCurrentLocation());
		
		
		Falcon falcon = new Falcon(2);
		falcon.fly();
		System.out.println(falcon.getCurrentLocation());
		System.out.println(falcon.getNumberOfEggs());
		falcon.layEggs();
		System.out.println(falcon.getNumberOfEggs());
		
	}
		
	}


