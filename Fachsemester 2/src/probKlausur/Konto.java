package probKlausur;


public class Konto {

	private final int kontonummer;
	protected int kontostand;
	static int num = 0;
	public int previosKontostand = 0;
	public Konto(int kontostand) {
		
		this.kontostand = kontostand;
		this.kontonummer = kontonummergen();
	}
	
	public int getKontonummer() {
		return kontonummer;
	}
	
	
	private static int kontonummergen() {
		String s = "";
		for(int i = 0; i < 7; i++)
			s+=(int)(Math.random()*10	);
		s += num;
		if(num>=10)
			num= 0;
		else
		num+=1;
		
		return Integer.parseInt(s);
	}
	
	public boolean setKontostand(int kontostand) {
		this.previosKontostand = kontostand;
		this.kontostand = kontostand;
		
		return true;
	}
	
	public int auszahlung(int betrag) {
		try{
		if(kontostand-betrag>=0) {
			this.previosKontostand = kontostand;
			this.kontostand-=betrag;
			return betrag;
		}
		else 
			throw new InvalidKontostandException("Invalid Value");
	}
		catch(InvalidKontostandException e) {
			return 0;
		}
		
	}
	public boolean einzahlung(int betrag) {
		this.previosKontostand = kontostand;
		this.kontostand+=betrag;
		
		return true;
	}
	
	public void undoLastOperation() {
		if(previosKontostand != 0) {
		this.kontostand = this.previosKontostand;
		this.previosKontostand = 0;
		}
	}
	
	
	public String toString() {
		return "Kontonummer: "+kontonummer+", Kontostand: "+kontostand;
	}
	
}
