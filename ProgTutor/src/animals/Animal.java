package animals;

public abstract class Animal
{
	protected String name;

	public abstract void move();

	public abstract void makeNoise();

	public abstract String getSpecies();

	@Override
	public String toString()
	{
		return name;
	}
}
