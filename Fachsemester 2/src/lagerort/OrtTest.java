package lagerort;
public class OrtTest {


	public static void main(String[] args) {
		
		/* getypte Orte mit Integer */
		Integer[] iArr = {63, 98, 72, 4, 6, 63, 57, 55, 83, 29 };
		
		Ort<Integer>[] ortInts;
		ortInts = new Ort[iArr.length];
		
		for (int i = 0; i < iArr.length; i++) {
			ortInts[i] =new Ort<Integer> (i);
			ortInts[i].hinzufügen(iArr[i]);
			
		}
		
		/* Ausgabe aller Elemente */
		for (Ort<Integer> o : ortInts)
			System.out.println(o);
		
		ortInts[5].entnehmen();
		
		/* Ausgabe aller Elemente */
		for (Ort<Integer> o : ortInts)
			System.out.println(o);
		
		System.out.println();
		
		
		/* getypte Orte mit Strings */
		
		String[] produkte= { "PC Fujitsu LA 3740", "Miele Waschmaschine ML300" , "Siemens HL 500" , 
				"OSRAM MM 100", "Bosch " };
		Ort<String>[]  ortStrings = new Ort[produkte.length];
		
		for (int i = 0; i < produkte.length; i++) {
			ortStrings[i] =new Ort<String> (i);
			ortStrings[i].hinzufügen(produkte[i]);
		}
		
		/* Ausgabe aller Elemente */
		for (Ort<String> o : ortStrings)
			System.out.println(o);
		
		/* Alle entnehmen */
		for (Ort<String> o : ortStrings) {
			o.entnehmen();
			
		}
		
		/* Ausgabe aller Elemente */
		for (Ort<String> o : ortStrings)
			System.out.println(o);
		
	}

}
