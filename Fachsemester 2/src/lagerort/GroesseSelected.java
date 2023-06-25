package lagerort;
public class GroesseSelected implements Selectable<Kleidungsstück> {
	private int groesse;
	
	public GroesseSelected(int g) {
		groesse = g;
	}
	
	public boolean isSelected(Kleidungsstück k) {
		
		if (k == null)
			return false;
		else
			return (groesse == k.groesse) ? true : false;

	}



}
