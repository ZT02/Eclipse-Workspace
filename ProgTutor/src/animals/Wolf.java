package animals;

public class Wolf extends LandAnimal
{
	public Wolf(String name)
	{
		this.name = name;
	}

	@Override
	public void makeNoise()
	{
		System.out.print("Awooooo");
	}

	@Override
	public String getSpecies()
	{
		return "Wolf";
	}

	public String toString() {
		return getSpecies() +" "+name;
	}
}
