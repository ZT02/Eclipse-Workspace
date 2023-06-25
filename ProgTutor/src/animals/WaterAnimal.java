package animals;

public abstract class WaterAnimal extends Animal
{

	@Override
	public void move()
	{
		System.out.print("swimming around");
	}

	@Override
	public abstract void makeNoise();

	@Override
	public abstract String getSpecies();

}
