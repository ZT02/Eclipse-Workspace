package mobile;

public class GlitterStar extends Star {

	private double glitterweight = 0;
	
	public GlitterStar(double weight) {
		super(weight);
	}
	
	public void decorate() {
		glitterweight++;
	}
	
	public double weight() {
		return super.weight() + glitterweight;
	}
	public String toString() {
		return String.format("GlitterStar[%f + %f]", super.weight(), glitterweight);
	}
}
