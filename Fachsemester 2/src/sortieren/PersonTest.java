package sortieren;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Bibliothek.book;

public class PersonTest{
	
	
	public static Person[] bestandSortierenNach(Person[] p) {
		// array sorting
		// loop to control number of passes
		for (int pass = 0; pass < p.length; pass++) {

			// loop to control number of comparisons
			for (int element = 0; element < p.length - 1 - pass; element++) {

				// compare side-by-side elements and swap them if
				// first element is greater than second element
				if (p[element].compareTo(p[element+1]) > 0) {

					Person temp; // temporary holding area for swap

					temp = p[element];
					p[element] = p[element+1];
					p[element+1] = temp;
					
				}

			} // end loop to control comparisons

		} // end loop to control passes
		return p;

	}
	
	
	public static void main(String... args) {
		Person[] people = new Person[] { new Person("Ted", "Neward", 41), new Person("Charlotte", "Neward", 41),
				new Person("Michael", "Neward", 19), new Person("Matthew", "Neward", 13),
				new Person("Adam", "Pfeiffer", 43) };
		Person[] test1 = new Person[people.length];
		Person[] test2 = new Person[people.length];
		Person[] test3 = new Person[people.length];
		System.arraycopy(people, 0, test1, 0, people.length);
		System.arraycopy(people, 0, test2, 0, people.length);
		System.arraycopy(people, 0, test3, 0, people.length);
		System.out.println();
		test1 = bestandSortierenNach(test1);
		Arrays.asList(test1).forEach((Person p) -> System.out.println(p));
		System.out.println();
		Arrays.sort(test2);
		Arrays.asList(test2).forEach((Person p) -> System.out.println(p));
		System.out.println();
		Collections.sort(Arrays.asList(test3), Comparator.comparing((Person p)-> p.getFirstName()));
		Arrays.asList(test3).forEach((Person p) -> System.out.println(p));
	}




	
	



}
