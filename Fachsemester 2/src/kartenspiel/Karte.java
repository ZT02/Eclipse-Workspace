package kartenspiel;

public class Karte implements Comparable<Karte> {

    enum Farbe {KREUZ, PIK, HERZ, KARO};
    enum Wert {SIEBEN, ACHT, NEUN, ZEHN, BAUER, DAME, KOENIG, ASS};

    private Farbe kartenFarbe;
    private Wert kartenWert;

    Karte (Farbe f, Wert w) {
        this.kartenFarbe = f;
        this.kartenWert = w;
    }
    
    public Farbe getFarbe () {
        return this.kartenFarbe;
    }

    public Wert getWert () {
        return this.kartenWert;
    }

    public void setFarbe (Farbe f) {
        this.kartenFarbe = f;
    }

    public void setWert (Wert w) {
        this.kartenWert = w;
    }

    public String toString() {
        return "Kartenfarbe: " + kartenFarbe.toString()+ "\n Kartenwert: " + kartenWert.toString() + "\n \n";
    }

    @Override
    public int compareTo(Karte k) {
        // Karo < Herz < Pik < Kreuz
        // enum Farbe {KREUZ, PIK, HERZ, KARO};

        if(k.kartenFarbe.equals(this.kartenFarbe))  return 0;
        if(k.kartenFarbe.ordinal() < this.kartenFarbe.ordinal()) return 1;
        if(k.kartenFarbe.ordinal() > this.kartenFarbe.ordinal()) return -1;

        return 0;
    }
    
    public boolean equals(Object k) {
    	if(k==null)
    		return false;
    
    	if(!(this.getClass()==k.getClass())) //Karten Objekte mit Karten vergleichen
    		return false;
//    	
//    	if(!super.equals(k))
//    		return false;
    	
    	Karte2 k2 = (Karte2)k; //Downcast um Zugriff auf die Instanzvariablen von k zu erhalten, wir müssen es schließlich das Object k erstmal aus Karte typisieren
    	//Instanzvariablen equals Vergleich
    	if(this.kartenFarbe.equals(k2.kartenFarbe) != true)
    		return false;
    	if(this.kartenWert.equals(k2.kartenWert) !=true)
    		return false;
    	
    	
    	return true;
    }
    

}