package kartenspiel;

import kartenspiel.Karte.Farbe;
import kartenspiel.Karte.Wert;
import java.util.Arrays;

public class Kartenspiel {

	private Farbe[] palette = Farbe.values();
	private Wert[] nummern = Wert.values();
	private Karte[] deck;

	Kartenspiel(int n) {
		deck = new Karte[n];
		for (int i = 0; i < n; i++) {
			deck[i] = new Karte(palette[(int) (Math.random() * palette.length)],
					nummern[(int) (Math.random() * nummern.length)]);
		}
	}

	public Karte[] getDeck() {
		return deck;
	}

	public void setDeck(Karte[] k) {
		this.deck = k;
	}

	public String toString() {
		System.out.println("--=- AKTUELLES DECK -=-- \n");
		String output = "";
		for (Karte f : deck) {
			output = output + f.toString();
		}
		return output;
	}

	void mischen() {
		int rand;
		Karte tausch;
		System.out.println("--=- MISCHEN -=-- \n");
		for (int i = 0; i < deck.length; i++) {

			rand = (int) (Math.random() * deck.length);
			tausch = deck[i];
			deck[i] = deck[rand];
			deck[rand] = tausch;
		}
	}

	void sort() {
		System.out.println("--=- SORTIEREN (ABSTEIGEND) -=-- \n");
		Arrays.sort(deck);
	}

	void kartenspielHinzufuegen(Kartenspiel neu) {
		System.out.println("--=- KARTEN HINZUFÜGEN -=-- \n");
		Karte[] original = this.deck;
		this.deck = new Karte[original.length + neu.deck.length];
		System.arraycopy(original, 0, deck, 0, original.length);
		System.arraycopy(neu.deck, 0, deck, original.length, neu.deck.length);
	}
}