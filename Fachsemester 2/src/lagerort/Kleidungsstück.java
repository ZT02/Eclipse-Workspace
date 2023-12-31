package lagerort;
public abstract class Kleidungsstück implements Artikel {
	public enum Farbe {SCHWARZ, GRÜN, ROT, BLAU, GRAU};
	protected final int groesse;
	protected final Farbe farbe;
	protected final String bezeichnung;
	protected String artNr;
	

	protected Kleidungsstück(int groesse, Farbe f, String bezeichnung) {
		this.farbe = f;
		this.groesse = groesse;
		this.bezeichnung = bezeichnung;
	}
	
	public String bezeichnung() {
		return this.bezeichnung;
	}

	public int getGroesse() {
		return groesse;
	}

	public Farbe getFarbe() {
		return farbe;
	}
	
	public String toString() {
		return "" + bezeichnung + " " + groesse + " " + farbe;
		
	}
	
	
	 
	
	

}
