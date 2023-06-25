package kartenspiel;

public class TrickKarte extends Karte{
	
	protected boolean wertUnsichtbar;
	
	public TrickKarte(Farbe f, Wert w, boolean b) {
		super(f,w);
		this.wertUnsichtbar =b;
		
	}
	
	public boolean equals(Object o) {
		if (o == null)
			return false;
		
		if (getClass() != o.getClass())
			return false;
		
		if (!super.equals(o))
			return false;
		
		TrickKarte k = (TrickKarte)o;
		
		if (this.wertUnsichtbar != k.wertUnsichtbar)
			return false;
		
		
		return true;
		
	}
	
	public int hashCode() {
		int hash = super.hashCode();
		int p = 37;
		
		if (wertUnsichtbar) hash = p*hash + 1;
		return hash;
	}

}
