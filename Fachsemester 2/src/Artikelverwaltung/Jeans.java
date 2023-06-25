package Artikelverwaltung;

import java.io.Serializable;

public class Jeans extends Kleidungsstück  implements Serializable{

	private static String typId = "567407";
	protected int schrittlänge;

	public static String typNummer() {
		return typId;
	}

	public Jeans(int groesse, Farbe f, String bezeichnung, int schrittlänge) {
		super(groesse, f, bezeichnung);
		artNr = typId + super.groesse;
		this.schrittlänge = schrittlänge;
	}

	public static boolean isJeans(String artikelnummer) {

		String s = new String(artikelnummer.substring(0, 5));
		return s.equals(typId);
	}

	public String artikelNummer() {
		return artNr;
	}

	public String toString() {
		return artNr + " " + super.toString() + " " + schrittlänge;
	}
}
