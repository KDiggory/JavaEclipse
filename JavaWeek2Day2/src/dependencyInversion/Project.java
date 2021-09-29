package dependencyInversion;


import java.util.Arrays;
import java.util.List;

public class Project {
	
	private List<Developer> developers;  
	developers.add(Frontend);
	developers.add(Backend);


	public Project(List<Developer> developers) {
		this.developers.forEach(d->d.writeCode());
	}
	}
