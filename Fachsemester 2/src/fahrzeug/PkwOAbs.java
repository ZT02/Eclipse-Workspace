package fahrzeug;

public class PkwOAbs extends Pkw {

	public PkwOAbs() {

	}

	public PkwOAbs(String name) {
		super(name, 140.0);
	}

	public double stoppen() {
		double anhalteweg, geschwindigkeit = getGeschwindigkeit() * 1000 / 3600;
		anhalteweg = Math.pow(geschwindigkeit / 10, 2) + 3 * (geschwindigkeit / 10);
		setPosition(getPosition() + anhalteweg / 1000);
		setGeschwindigkeit(0);
		return anhalteweg;
	}
}
