package fahrzeug;

public class Lkw extends Fahrzeug {
	private double ladung, maxLadung;

	public Lkw() {

	}

	public Lkw(String name, double ladung, double maxLadung) {
		super(name, 0.5, 105.0);
		this.maxLadung = maxLadung;
		beladen(ladung);

	}

	public double getLadung() {
		return ladung;
	}

	public void setLadung(double ladung) {
		this.ladung = ladung;
	}

	public double getMaxLadung() {
		return maxLadung;
	}

	public void setMaxLadung(double maxLadung) {
		this.maxLadung = maxLadung;
	}

	public double stoppen() {
		double bremsverzögerung, anhalteweg, geschwindigkeit = getGeschwindigkeit() * 1000 / 3600;
		if (istVollBeladen())
			bremsverzögerung = 3.0;
		else
			bremsverzögerung = 5.0;

		anhalteweg = 0.5 * geschwindigkeit * geschwindigkeit / bremsverzögerung + 3 * (geschwindigkeit / 10);
		setPosition(getPosition() + anhalteweg / 1000);
		setGeschwindigkeit(0);
		return anhalteweg;
	}

	public void beladen(double ladungInTonnen) {
		if (getLadung() + ladungInTonnen >= getMaxLadung())
			setLadung(getMaxLadung());
		else
			setLadung(getLadung() + ladungInTonnen);
		if (ladungInTonnen <= 0)
			setLadung(0);
	}

	public void entladen(double ladungInTonnen) {
		if (getLadung() - ladungInTonnen <= 0)
			setLadung(0);
		else if (ladungInTonnen <= 0)
			setLadung(getLadung() + ladungInTonnen);
		else
			setLadung(getLadung() - ladungInTonnen);

	}

	boolean istVollBeladen() {
		if (getLadung() >= getMaxLadung())
			return true;
		else
			return false;
	}
}
