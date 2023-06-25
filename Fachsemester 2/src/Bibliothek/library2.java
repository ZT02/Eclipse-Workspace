package Bibliothek;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class library2 {

	private TreeSet<book> bookList;

	public library2() {
		this.bookList = new TreeSet<book>();
	}

	public boolean einfügen(book b) {
		bookList.add(b);
		return true;
	}

	public Collection<book> sucheNachAutor(String autor) {
		List<book> autorBooks = new LinkedList<book>();
		for (book b : bookList)
			if (b.getAutor().equals(autor))
				autorBooks.add(b);

		return autorBooks;

	}

	public book sucheNachISBN(String isbn) {
		for (book b : bookList) {
			if (b.getISBN().equals(isbn))
				return b;
		}

		return null;

	}
// Wird nicht mehr benötigt, da TreeSet das ganze automatisch sortiert, indem in der Objekt Klasse, des Objekts, welches sortiert wird. Hier book. eine comparable methode festgelegt wird
//	public Collection<book> bestandSortierenNach(Comparator<book> comp) {
//		// array sorting
//		// loop to control number of passes
//		book[] bookListCopy = (book[]) bookList.toArray();
//		for (int pass = 0; pass < bookList.size(); pass++) {
//
//			// loop to control number of comparisons
//			for (int element = 0; element < bookList.size() - 1 - pass; element++) {
//
//				// compare side-by-side elements and swap them if
//				// first element is greater than second element
//				if (bookList.get(element).getTitle().compareTo(bookList.get(element + 1).getTitle()) > 0) {
//					bookList.
//					book temp; // temporary holding area for swap
//
//					temp = bookList.get(element);
//					bookList.set(element, bookList.get(element + 1));
//					bookList.set(element + 1, temp);
//				}
//
//			} // end loop to control comparisons
//
//		} // end loop to control passes
//		return bookList;
//
//	}
	
	public Map bestandNachAutor() {
		if(bookList.size()==0)
			return null;
		Map<String, HashSet<String>> test = new LinkedHashMap<String, HashSet<String>>();
		Set<String> checkAutor = new HashSet<String>();
		
		for(book b : bookList) {
			HashSet<String> titles = new HashSet<String>();
			if(!checkAutor.contains(b.getAutor())) {
				checkAutor.add(b.getAutor());
				for(book c : bookList)
					if(c.getAutor().equals(b.getAutor()))
						titles.add("\""+c.getTitle()+"\"");
				test.put(b.getAutor(), titles);
			}
			
		}
		return test;
	}
	
	

	public String toString() {
		if (bookList.isEmpty())
			return null;
		Iterator<book> it = bookList.iterator();
		String s = "[\n";
		while (it.hasNext()) {
			
			s+=it.next()+ "\n";
			}

		

		s += "]";

		return s;
	}

}
