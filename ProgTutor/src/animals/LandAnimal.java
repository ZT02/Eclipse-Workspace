package animals;

public abstract class LandAnimal extends Animal
{

	@Override
	public void move()
	{
		System.out.print("walking around");
	}

	@Override
	public abstract void makeNoise();

	@Override
	public abstract String getSpecies();

}
