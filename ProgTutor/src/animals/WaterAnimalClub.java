package animals;

import java.util.ArrayList;
import java.util.List;

public class WaterAnimalClub<E extends WaterAnimal> {
	private List<E> zoo;
	public WaterAnimalClub() {
		zoo = new ArrayList<E>();
	}

	public boolean addAnimal(E a) {
		zoo.add(a);
		return true;
	}
}
