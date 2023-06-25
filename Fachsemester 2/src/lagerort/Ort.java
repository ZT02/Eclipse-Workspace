package lagerort;
public class Ort<E> {
	
	private E eingelagertesElem;
	private final int ortsid; 
	
	public Ort(int ortsID) {
		ortsid = ortsID;
	}
	
	public boolean istBelegt() {
		return (eingelagertesElem == null? false : true);
	}
	
	public void hinzufügen(E e) {
		eingelagertesElem = e;
	}
	
	public E entnehmen() {
		E e = eingelagertesElem;
		eingelagertesElem = null;
		return e;
	}

	public int getOrtsid() {
		return ortsid;
	}
	
	public String toString() {
		return "OrtId:" + ortsid + " " + ((eingelagertesElem != null)?eingelagertesElem.toString(): null);
	}

	public E getEingelagertesElem() {
		return eingelagertesElem;
	}
	

}
