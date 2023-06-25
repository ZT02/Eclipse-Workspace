package Bibliothek;

import java.util.Comparator;

public class bookOrdnung implements Comparator<book> {
//Ordnung kann beliebig festgelegt werden, getTitle auch durch getAutor ersetzbar oder durch die ISBN
	public int compare(book b1, book b2) {
		return b1.getTitle().compareTo(b2.getTitle());
	}
}
