package bibliothekLambdas;

import java.util.Map;

import Bibliothek.book;
import Bibliothek.bookOrdnung;
import Bibliothek.library;

public class test {
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
		
		Bibliothek one = new Bibliothek();
		one.einfuegen(first);
		one.einfuegen(second);
		one.einfuegen(third);
		one.einfuegen(fourth);
		one.einfuegen(fifth);
		one.einfuegen(sixth);
		one.einfuegen(seventh);
		one.einfuegen(eight);
		one.einfuegen(nine);
		one.einfuegen(ten);
		one.einfuegen(eleven);
		
		System.out.println("Bibliothek unsortiert");
		System.out.println(one.toString());
		System.out.println("bib sortiert");
		one.bestandSortierenNach();
		System.out.println(one.toString());
		System.out.println("ISBN");
		System.out.println(one.sucheNachISBN("0136290310"));
		System.out.println("ISBN ende");
		System.out.println(one.sucheNachAutor("Bertrand Meyer").toString());
		System.out.print("\n\n\n\n\n");
		Map oneone = one.bestandNachAutorAuflisten();
		System.out.println(oneone.get("Bertrand Meyer").toString());
}
}