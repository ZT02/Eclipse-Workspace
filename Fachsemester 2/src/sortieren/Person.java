package sortieren;

import java.util.Collection;
import java.util.Comparator;

import Bibliothek.book;

class Person implements Comparable<Person>{
	private final String firstName;
	private String lastName;
	private final int age;

	public Person(String f, String l, int a) {
		firstName = f;
		lastName = l;
		age = a;
	}
	
	public int compare(String s1,  String s2) {
		return s1.compareTo(s2);
	}
	
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.firstName.compareTo(o.firstName);
	}

	
	
	
	
}
