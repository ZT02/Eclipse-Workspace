package student;

public class Dozent extends Person {
	private String lehrgebiet;

	public Dozent() {

	}

	public Dozent(String vorname, String nachname, String strassenname, String hausnummer, String ort, int postleitzahl,
			String lehrgebiet, int gehalt) {
		super(vorname, nachname, strassenname, hausnummer, ort, postleitzahl, gehalt);
		this.lehrgebiet = lehrgebiet;
	}

	public String getLehrgebiet() {
		return this.lehrgebiet;
	}

	public void setLehrgebiet(String lehrgebiet) {
		this.lehrgebiet = lehrgebiet;
	}

	public int getGehalt() {
		return this.gehalt;
	}

	public String toString() {
		return " " + vorname + " " + nachname + " " + strassenname + " " + hausnummer + " " + postleitzahl + " " + ort
				+ " " + lehrgebiet + " " + gehalt;
	}
}
