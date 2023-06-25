package animals;

import java.util.ArrayList;
import java.util.List;

public class LandAnimalClub<E extends LandAnimal> {
	private List<E> zoo;
	public LandAnimalClub() {
		zoo = new ArrayList<E>();
	}

	public boolean addAnimal(E a) {
		zoo.add(a);
		return true;
	}
	
}
