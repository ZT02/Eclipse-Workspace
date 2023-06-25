package lagerort;
import java.util.Vector;

public class JeansArtikelLagerTest {


	public static void main(String[] args) {
		
		
		final int ANZAHL = 6;
		final int WIEOFT = 2;
		
		Jeans[] arts = new Jeans[ANZAHL * WIEOFT];
		
		lagerInitialisieren(arts,ANZAHL,WIEOFT);
		
		ArtikelLager<Kleidungsstück> lager = new ArtikelLager<Kleidungsstück>(arts, 500);
		
		System.out.println(lager);
		
		System.out.println("ArtNr: " + Jeans.typNummer()+"42 Bestand:" + lager.bestandSuchen(Jeans.typNummer()+"42"));
		
		System.out.println(lager.auslagern("56740742"));
		System.out.println("ArtNr: " + Jeans.typNummer()+"42 Bestand:" + lager.bestandSuchen(Jeans.typNummer()+"42"));
	
		
		GroesseSelected kSelect = new GroesseSelected(38);
		Vector<Kleidungsstück> v = lager.filter(kSelect);
		System.out.println(v);
		
	}
	
	static void lagerInitialisieren(Jeans[] art, int anz, int wieoft) {
		String[] bez = { "Jeans Levis 501", "Jeans Levis 502",
				"Jeans Wrangler 50", "Jeans Denim 550 ", "Jeans Denim 548",
				"Jeans Wrangler 49" };
		int[] groesse = { 34, 36, 38, 40, 42, 44 };
		int[] schritt = { 340, 360, 380, 400, 420, 440 };

		

		for (int i = 0; i < anz * wieoft; i++) {
			String bezeich = bez[i % bez.length];

			Kleidungsstück.Farbe f = Kleidungsstück.Farbe.values()[i
					% Kleidungsstück.Farbe.values().length];
			int gr = groesse[i % groesse.length];
			int s = schritt[i % schritt.length];

			art[i] = new Jeans(gr, f, bezeich, s);

		}

	}

}
