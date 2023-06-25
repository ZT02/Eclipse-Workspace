package probKlausur;

public class Kreditkonto extends Konto{
	
	public Kreditkonto(int nevbetrag) {
		super(nevbetrag);
		try {
			if(nevbetrag>=0)
				throw new InvalidKontostandException("negativer Betrag erforderlich");
			
		}	catch(InvalidKontostandException e) {
				
			}
		
	
		
		
		
		
	}
	
	public int auszahlung(int betrag) {
		try {
		throw new InvalidKontostandException("Falscher Wert");	
		}catch(InvalidKontostandException e) {
			return 0;
		}
		
		
		
	}
	//gibt überschüssiges Geld zurück
	public boolean einzahlung(int betrag) {
		if(kontostand+betrag<0) {
			this.kontostand+=betrag;
			return true;
		}
		else
			try {
		throw new InvalidKontostandException();
	}
		catch(InvalidKontostandException e) {
			return false;
		}
		
	}
	
	public boolean setKontostand(int kontostand) {
		try {
		if(this.kontostand >= 0) {
		this.previosKontostand = kontostand;
		this.kontostand = kontostand;
		
		return true;
		}
		else throw new InvalidKontostandException("ist negativ");
	}
		catch(InvalidKontostandException e) {
			return false;
		}
		
	
	}
}
