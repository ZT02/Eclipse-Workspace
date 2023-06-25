package animals;

public class Tierfänger {
	static LandAnimalClub<LandAnimal> land = new LandAnimalClub<LandAnimal>();
	static WaterAnimalClub<WaterAnimal> water = new WaterAnimalClub<WaterAnimal>();
	public static void goInLandAnimalClub(LandAnimal a) {
		land.addAnimal(a);
		System.out.println("Tierfänger hat "+a.toString()+" gefangen!");
	}
	
	public static void goIntWaterAnimalClub(WaterAnimal w) {
		water.addAnimal(w);
		System.out.println("Tierfänger hat "+w.toString()+" gefangen!");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wolf w1 = new Wolf("Harald");
		Kangaroo k = new Kangaroo("Florie");
		Whale wh1 = new Whale("Moby Dick");
		goInLandAnimalClub(w1);
		goInLandAnimalClub(k);
		goIntWaterAnimalClub(wh1);
//		goInWaterAnimalClub(k);
		
	}

}
