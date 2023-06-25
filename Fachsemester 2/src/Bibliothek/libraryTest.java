package Bibliothek;

import java.util.Collection;
import java.util.Map;

public class libraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book first = new book("Reinhard Schiedermeier", "Java Praktikum", "9784898645133");
		book second = new book("Harvey Deitel", "How to program Java", "01303451517");
		book third = new book ("Bertrand Meyer", "Object Oriented Software Construction","0136290310");
		book fourth = new book("Bertrand Meyer", "Software Engineering Approaches for Offshore and Outsourced Development", "9783642018558");
		book fifth = new book("Kathy Sierra", "Java von Kopf bis Fuss", "9783897214484");
		book sixth = new book("Reinhard Schiedermeier", "Java Praktikum", "9784898645133");
		book seventh = new book("Harvey Deitel", "How to program Java",  "01303451517");
		book eight = new book("Bertrand Meyer", "Object Oriented Software Construction", "0136290310");
		book nine = new book("Bertrand Meyer", "Software Engineering Approaches for Offshore and Outsourced Development", "9783642018558");
		book ten = new book("Kathy Sierra", "Java von Kopf bis Fuss", "9783897214484");
		book eleven = new book("Mark Utting", "Pratical Model based Testing", "9780123725011");
		
		library one = new library();
		one.einfügen(first);
		one.einfügen(second);
		one.einfügen(third);
		one.einfügen(fourth);
		one.einfügen(fifth);
		one.einfügen(sixth);
		one.einfügen(seventh);
		one.einfügen(eight);
		one.einfügen(nine);
		one.einfügen(ten);
		one.einfügen(eleven);
		
		System.out.println("Bibliothek unsortiert");
		System.out.println(one.toString());
		System.out.println("Bibliothek sortiert");
		one.bestandSortierenNach(new bookOrdnung());
		System.out.println(one.toString());
		System.out.println(one.sucheNachISBN("0136290310"));
		System.out.println(one.sucheNachAutor("Bertrand Meyer").toString());
		
		Map oneone = one.bestandNachAutor();
		System.out.println(oneone.get("Bertrand Meyer").toString());
	}

}
