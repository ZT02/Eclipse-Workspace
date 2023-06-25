package bibliothekLambdas;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Bibliothek.book;

public class Bibliothek {
	private List<book> library;
	public Bibliothek() {
		this.library = new LinkedList<book>();
	}
	public boolean einfuegen(book b) {
		library.add(b);
		return true;
		
	}
	public Collection<book> getBuecher() {
		return library;
		
	}
	
	public Collection<book> bestandSortierenNach() {
		
		 return (List<book>)(library.stream().sorted((b, p)->b.getTitle().compareTo(p.getTitle())).toList());
		 
	}
	
	
	
	public Collection<book> sucheNachAutor(String autor) {
		if(library.size()==0)
			return null;
		else {
			return library.parallelStream().filter((book p) -> p.getAutor().equals(autor)).toList();
		}
		
		
	}
	public book sucheNachISBN(String isbn) {
		if(library.size()==0)
			return null;
		else {
			 return (library.parallelStream().filter((book b)->b.getISBN().equals(isbn)).toList()).get(0);
		}
	
		
	}
	public Map<String, List<book>> bestandNachAutorAuflisten() {
		if(library.size()==0)
			return null;
		Map<String, List<book>> test = new LinkedHashMap<String, List<book>>();

		List<String> autors = new LinkedList<String>();
//		library.parallelStream().sorted((book b, book p)-> b.getAutor().compareTo(p.getAutor())).toList();
		
		autors.parallelStream().sorted();
		
		library.stream().distinct().sorted((book b, book p)-> b.getAutor().compareTo(p.getAutor())).forEach(b -> autors.add(b.getAutor()));
		autors.stream().distinct().forEach((String s) -> test.put(s, (List<book>) sucheNachAutor(s)));
		
		
		
		
			
		
		return test;
		
	}
	public String toString() {
		if (library.isEmpty())
			return null;

		String s = "[\n";
		for (int i = 0; i < library.size(); i++) {
			if (i == library.size() - 1)
				s += library.get(i).toString() + "\n";
			else {
				s += library.get(i).toString() + ",\n";
			}

		}

		s += "]";

		return s;
	}
}
