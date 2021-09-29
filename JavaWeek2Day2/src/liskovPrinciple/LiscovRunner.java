package liskovPrinciple;

public class LiscovRunner {
	
	public static void main(String[] args) {
		Studio studio = new Studio();
		studio.setNumberOfBedrooms(1);
		Penthouse penthouse = new Penthouse();
		penthouse.setNumberOfBedrooms(6);
		System.out.println(studio.getNumberOfBedrooms());
		System.out.println(penthouse.getNumberOfBedrooms());
		
		BedroomAdder bedRoom = new BedroomAdder();
		bedRoom.addBedroom(penthouse);
		System.out.println(penthouse.getNumberOfBedrooms());
	}

}
