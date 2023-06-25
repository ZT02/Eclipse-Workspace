package exception;

public class Zaehler {
private	int einer = 0;
private int zehner = 0;
	
public Zaehler() {
	
}
	void erhoeheUmEins() {
		
	System.out.println("Einer: " + einer);
	einer = einer + 1;
	
		try {
		if(einer >= 10) {
		einer = 0;
		throw new EinerUeberlauf();
		}
		
	}
	catch(EinerUeberlauf e) {
		erhoeheUmZehn();
	}
	}
	
	
	void erhoeheUmZehn() {
		
	System.out.println("Zehner: " + zehner);
	zehner = zehner + 1;
	try {
		if(zehner >= 10) {
		zehner = 0;
		throw new Ueberlauf();
		}
	}
	catch(Ueberlauf e) {
		System.out.println("Fehler aufgetreten: Ueberlauf!");
		System.exit(1);
	}
	}
	
	void zaehlen() {
		
		erhoeheUmEins();
	}
}
