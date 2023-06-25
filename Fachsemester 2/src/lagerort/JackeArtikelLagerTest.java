package lagerort;
import java.util.Vector;

public class JackeArtikelLagerTest {


	public static void main(String[] args) {
		
		
		final int ANZAHL = 6;
		final int WIEOFT = 2;
		
		Jacke[] arts = new Jacke[ANZAHL * WIEOFT];
		
		lagerInitialisieren(arts,ANZAHL,WIEOFT);
		
		ArtikelLager<Kleidungsstück> lager = new ArtikelLager<Kleidungsstück>(arts, 5);
		
		System.out.println(lager);
		
		System.out.println("ArtNr: " + Jacke.typNummer()+"42 Bestand:" + lager.bestandSuchen(Jacke.typNummer()+"42"));
		
		System.out.println(lager.auslagern("56740742"));
		System.out.println("ArtNr: " + Jacke.typNummer()+"42 Bestand:" + lager.bestandSuchen(Jacke.typNummer()+"42"));
	
		
		GroesseSelected kSelect = new GroesseSelected(38);
		Vector<Kleidungsstück> v = lager.filter(kSelect);
		System.out.println(v);
		
	}
	
	static void lagerInitialisieren(Jacke[] art, int anz, int wieoft) {
		String[] bez = { "Fleece Jacke Roos", "Lederjacke Only", "Blouson", "Kapuzenparka Cheer ", 
				"Jacke Melrose", "BLENDSHE"};
		int[] groesse = { 34, 36, 38, 40, 42, 44 };
		int[] wassersaeule = { 100, 1000, 2000, 3000};
		

		

		for (int i = 0; i < anz * wieoft; i++) {
			String bezeich = bez[i % bez.length];

			Kleidungsstück.Farbe f = Kleidungsstück.Farbe.values()[i
					% Kleidungsstück.Farbe.values().length];
			int gr = groesse[i % groesse.length];
			int ws = wassersaeule[i % wassersaeule.length];

			art[i] = new Jacke(gr, f, bezeich, ws);

		}

	}

}
