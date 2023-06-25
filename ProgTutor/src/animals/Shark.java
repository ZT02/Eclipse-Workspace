package animals;

public class Shark extends WaterAnimal
{

	public Shark(String name)
	{
		this.name = name;
	}

	@Override
	public void makeNoise()
	{
		System.out.print("*SNAP");
	}

	@Override
	public String getSpecies()
	{
		return "Shark";
	}
	public String toString() {
		return getSpecies() +" "+name;
	}
}
