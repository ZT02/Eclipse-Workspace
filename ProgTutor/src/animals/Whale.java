package animals;

public class Whale extends WaterAnimal
{

	public Whale(String name)
	{
		this.name = name;
	}

	@Override
	public void makeNoise()
	{
		System.out.print("OUUUHHHHUUUUAAAAA");
	}

	@Override
	public String getSpecies()
	{
		return "Whale";
	}

	public String toString() {
		return getSpecies() +" "+name;
	}
}
