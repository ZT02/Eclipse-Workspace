package lagerort;
import java.util.Vector;

public class ArtikelLager<E extends Artikel> {

	private Ort<E>[] orte;
	

	public ArtikelLager(E[] elems, int anzahlOrte){

		orte = new Ort[anzahlOrte];

		for (int i = 0; i < anzahlOrte; i++)
			orte[i] = new Ort<E>(i);

		for (E e : elems)
			this.einlagern(e);
	}

	public boolean einlagern(E e) {
		for (Ort<E> o : orte)
			if (!o.istBelegt()) {
				o.hinzufügen(e);
				return true;
			}
		return false;

	}

	public E auslagern(String artikelNummer) {

		Ort<E> ort = ortSuchen(artikelNummer);

		if (ort != null) {
			return ort.entnehmen();
		}
		return null;
	}

	private Ort<E> ortSuchen(String artNr) {
		for (Ort<E> o : orte) {
			E e = o.getEingelagertesElem();
			if (e != null) {
				if (e.artikelNummer().equals(artNr))
					return o;
			}
		}
		return null;
	}

	public int bestandSuchen(String artNr) {
		int bestand = 0;
		for (Ort<E> o : orte) {
			E e = o.getEingelagertesElem();
			if (e != null)
				if (e.artikelNummer().equals(artNr))
					bestand++;
		}
		return bestand;
	}

	public Vector<E> filter(Selectable<E> selectKrit) {
		Vector<E> result = new Vector<E>(orte.length);

		for (Ort<E> o : orte) {
			E e = o.getEingelagertesElem();
			if (selectKrit.isSelected(e))
				result.add(e);

		}
		return result;

	}

	public String toString() {

		String s = "";
		for (Ort<E> o : orte) {
			if (o.getEingelagertesElem() != null)
				s += o.getEingelagertesElem().toString() + "\n";
		}

		return s;
	}

}
