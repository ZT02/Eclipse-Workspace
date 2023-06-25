package lagerort;

import Artikelverwaltung.Artikel;

public class Jeans extends Kleidungsstück implements Artikel{ 
	
	private static String  typId="567407";
	private int schrittlänge;

	
	public static String typNummer() {
		return typId;
	}
	
	public Jeans(int groesse, Farbe f, String bezeichnung, int schrittlänge) {
		super(groesse,f,bezeichnung);
		artNr = typId + super.groesse;
	}
	
	public String artikelNummer() {
		return artNr;
	}

	public String toString() {
		return artNr +  " " + super.toString();
	}
}
