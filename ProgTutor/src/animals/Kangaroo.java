package animals;

public class Kangaroo extends LandAnimal
{

	public Kangaroo(String name)
	{
		this.name = name;
	}

	@Override
	public void move()
	{
		System.out.print("jumping around");
	}

	@Override
	public void makeNoise()
	{
		System.out.print("*kangaroo-sound");
	}

	@Override
	public String getSpecies()
	{
		return "Kangaroo";
	}
	public String toString() {
		return getSpecies() +" "+name;
	}
}
