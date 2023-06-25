package student;

public class Student extends Person {

	private int matrikelNummer;

	public Student() {

	}

	public Student(int matrikelNummer, String vorname, String nachname, String strassenname, String hausnummer,
			String ort, int postleitzahl, int gehalt) {
		super(vorname, nachname, strassenname, hausnummer, ort, postleitzahl, gehalt);
		this.matrikelNummer = matrikelNummer;

	}

	public int getMatrikelNummer() {
		return matrikelNummer;
	}

	public void setMatrikelNummer(int matrikelNummer) {
		this.matrikelNummer = matrikelNummer;
	}

	public int getGehalt() {
		return this.gehalt;
	}

	public String toString() {
		return "" + matrikelNummer + " " + vorname + " " + nachname + " " + strassenname + " " + hausnummer + " "
				+ postleitzahl + " " + ort + " " + gehalt;
	}

}
