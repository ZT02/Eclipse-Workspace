package probKlausur;

public class Girokonto extends Konto {
	private final int überzug;
	public Girokonto(int kontostand, int überzug) {
		super(kontostand);
		this.überzug = überzug;
		 try {
		if(überzug>0)
			throw new ÜberzugFalseValueException("Überzug >= 0");
		 }
		 catch(ÜberzugFalseValueException e) {
			
		 }
	}

	
	public boolean setKontostand(int kontostand) {
		try {
			if(kontostand > überzug) {
				this.previosKontostand = kontostand;
				this.kontostand = kontostand;
				return true;
					
		}
			else throw new InvalidKontostandException("Überzug");
		}
		catch(InvalidKontostandException e) {
			return false;
		}
		
		
	}
	
	public int auszahlung(int betrag) {
		try {
			if(kontostand-betrag> überzug) {
				this.previosKontostand = kontostand;
				this.kontostand-=betrag;
				return betrag;
					
		}
			else throw new InvalidKontostandException("Überzug");
		}
		catch(InvalidKontostandException e) {
			return 0;
		}
		
	}
	
	
	
}
