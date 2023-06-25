package kartenspiel;

import kartenspiel.Karte.Farbe;
import kartenspiel.Karte.Wert;

public class Karte2 {

	enum Farbe {KREUZ, PIK, HERZ, KARO};
    enum Wert {SIEBEN, ACHT, NEUN, ZEHN, BAUER, DAME, KOENIG, ASS};

    protected Farbe kartenFarbe;
    protected Wert kartenWert;

    Karte2 (Farbe f, Wert w) {
        this.kartenFarbe = f;
        this.kartenWert = w;
    }
}
