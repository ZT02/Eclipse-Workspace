package student;

public class Person {

	protected String vorname, nachname, strassenname, hausnummer, ort;
	protected int postleitzahl, gehalt;

	public Person() {

	}

	// Ohne gehalt, gibt für getGehalt() 0 aus, Konstruktor könnte theoretisch
	// weggelassen werden
	public Person(String vorname, String nachname, String strassenname, String hausnummer, String ort,
			int postleitzahl) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.strassenname = strassenname;
		this.hausnummer = hausnummer;
		this.ort = ort;
		this.postleitzahl = postleitzahl;
	}

	// Konstruktor mit gehalt
	public Person(String vorname, String nachname, String strassenname, String hausnummer, String ort, int postleitzahl,
			int gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.strassenname = strassenname;
		this.hausnummer = hausnummer;
		this.ort = ort;
		this.postleitzahl = postleitzahl;
		this.gehalt = gehalt;
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStrassenname() {
		return this.strassenname;
	}

	public void setStrassenname(String strassenname) {
		this.strassenname = strassenname;
	}

	public String getHausnummer() {
		return this.hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getOrt() {
		return this.ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getPostleitzahl() {
		return this.postleitzahl;
	}

	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	public String toString() {
		return "" + vorname + " " + nachname + " " + strassenname + " " + hausnummer + " " + ort + " " + postleitzahl
				+ " " + gehalt;
	}
}
