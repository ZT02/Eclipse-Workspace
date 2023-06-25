package probKlausur;

public class Sparkonto extends Girokonto {

	public Sparkonto(int kontostand) {
		super(kontostand, 0);
		 try {if(kontostand<=0)
			throw new InvalidKontostandException("Kontostand muss positiv sein");
		 }
		 catch(InvalidKontostandException e) {
			 
		 }
		// TODO Auto-generated constructor stub
	}
	
	public boolean setKontostand(int kontostand) {
		try {
		if(this.kontostand <= 0) {
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
