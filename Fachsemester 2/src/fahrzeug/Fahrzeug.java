package fahrzeug;

public class Fahrzeug {

	private double geschwindigkeit, beschleunigung, hoechstGeschwindigkeit, position;
	private String name;

	public Fahrzeug() {

	}

	public Fahrzeug(String name, double beschleunigung, double hoechstGeschwindigkeit) {
		this.position = 0;
		this.geschwindigkeit = 0;
		this.name = name;
		this.beschleunigung = beschleunigung;
		this.hoechstGeschwindigkeit = hoechstGeschwindigkeit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	public double getBeschleunigung() {
		return beschleunigung;
	}

	public double beschleunigen(double sekunden) {

		double sekundenInHoechstGeschwindigkeit, sekundenZuHoechstGeschwindigkeit, strecke;
		double beschleunigung2 = this.beschleunigung / 1000 * (3600 * 3600);
		sekunden = sekunden / 3600;
		if ((beschleunigung2 * sekunden) >= hoechstGeschwindigkeit()) {
			sekundenZuHoechstGeschwindigkeit = (hoechstGeschwindigkeit() / beschleunigung) / 3600;
			sekundenInHoechstGeschwindigkeit = (sekunden - sekundenZuHoechstGeschwindigkeit) / 3600;
			strecke = 0.5 * beschleunigung2 * sekundenZuHoechstGeschwindigkeit * sekundenZuHoechstGeschwindigkeit;
			geschwindigkeit = hoechstGeschwindigkeit();
			strecke = strecke + geschwindigkeit * sekundenInHoechstGeschwindigkeit;
		} else {
			strecke = 0.5 * beschleunigung2 * sekunden * sekunden;
			geschwindigkeit = geschwindigkeit + beschleunigung2 * sekunden;
		}
		position = position + strecke;
		return position;
	}

	public double hoechstGeschwindigkeit() {
		return hoechstGeschwindigkeit;
	}

	public double fahren(double minuten) {
		minuten = minuten / 60;
		position = position + geschwindigkeit * minuten;
		return position;
	}

}
