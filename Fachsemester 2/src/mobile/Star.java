package mobile;

public class Star implements Mobile{
	
	private final double weight;
	public Star(double weight) {
		if(weight < 0) {
			throw new IllegalArgumentException("Gewicht darf nicht negativ sein");
		}
		this.weight = weight;
	}
	public double weight() {
		return weight;
	}
	
	public void balance() {
		
	}
	
	public String toString()
	{
		return String.format("Star[%f]", weight);
	}

}
