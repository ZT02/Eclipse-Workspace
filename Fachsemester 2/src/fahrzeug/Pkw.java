package fahrzeug;

public class Pkw extends Fahrzeug {

	public Pkw() {

	}

	public Pkw(String name) {
		super(name, 2.0, 160.0);

	}

//für Pkw ohne ABS
	public Pkw(String name, double hoechstGeschwindigkeit) {
		super(name, 2.0, hoechstGeschwindigkeit);
	}

	public double stoppen() {
		double anhalteweg, geschwindigkeit = getGeschwindigkeit() * 1000 / 3600;
		anhalteweg = 0.5 * (Math.pow(geschwindigkeit / 10, 2)) + 3 * (geschwindigkeit / 10);
		setPosition(getPosition() + anhalteweg / 1000);
		setGeschwindigkeit(0);
		return anhalteweg;
	}
}
