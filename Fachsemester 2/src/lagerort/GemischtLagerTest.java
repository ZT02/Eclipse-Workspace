package lagerort;
import java.util.Vector;

public class GemischtLagerTest {


	public static void main(String[] args) {
		
		
		String[] bez  = { "Jeans Levis 501", "Jeans Levis 502", "Jeans Wrangler 50", "Jeans Denim 550 " };
		String[] bez2  = { "Fleece Jacke Roos", "Lederjacke Only", "Blouson", "Kapuzenparka Cheer " };
		int[] groesse = { 34, 36, 38, 40, 42, 44 };
		int[] schritt = { 340, 360, 380, 400, 420, 440 };
		int[] saeule = { 2000, 4000, 8000, 10000 };
		final int ANZAHL = 6;
		
		Kleidungsstück[] arts = new Kleidungsstück[ANZAHL];
		
		for (int i = 0; i < ANZAHL; i++) {
			String bezeich = bez[(int)(Math.random()*bez.length)];
			String bezeich2 = bez2[(int)(Math.random()*bez.length)];
			int f = (int) (Math.random() * Kleidungsstück.Farbe.values().length);
			int gr = groesse[(int)(Math.random()*groesse.length)];
			int s = schritt[(int)(Math.random()*schritt.length)];
			int sl = saeule[(int)(Math.random()*saeule.length)];
			
			if (i %2 == 0) 
				arts[i] = new Jeans(gr, Kleidungsstück.Farbe.values()[f],bezeich,s);
			else 
				arts[i] = new Jacke(gr, Kleidungsstück.Farbe.values()[f],bezeich2,sl);
			
		}
		
		
		
		ArtikelLager<Kleidungsstück> lager = new ArtikelLager<Kleidungsstück>(arts, 500);
		
		System.out.println(lager);
		
		System.out.println("ArtNr: " + Jeans.typNummer()+"42 Bestand:" + lager.bestandSuchen(Jeans.typNummer()+"42"));
		//System.out.println(lager);
		
		/*
		Vector<Kleidungsst�ck> v = lager.suchenMitFarbe(Kleidungsst�ck.Farbe.GRAU);
		System.out.println(v);
		*/
		
		
		
		GroesseSelected kSelect = new GroesseSelected(42);
		Vector<Kleidungsstück> v = lager.filter(kSelect);
		System.out.println(v);
		
		/*
		WassersaeuleSelected vSelect = new WassersaeuleSelected(8000);
		v = lager.filter(vSelect);
		System.out.println(v);
		*/
	
	
		
	}

}
