package student;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student aStudent = new Student(455555, "Peter", "Müller", "Hauptstrasse", "4a", "Coburg", 96450, 1000);
		Dozent aDozent = new Dozent("Hans", "Meyer", "Jenaerstrasse", "21", "Coburg", 96450, "Betriebssysteme", 1000);
		Dozent aDozent2 = new Dozent("Querinr", "Meyer", "Coburgerstraße", "74", "Coburg", 96550,
				"Rechnerarchitekturen", 5000);
		Person aPerson = new Person("Markus", "Leistner", "Fantasystreet", "91", "Bamberg", 45671, 200);
		Person aPerson2 = new Person("Heiko", "Coomer", "Realstreet", "45", "Hallstadt", 8561);
		Person[] personArray = { aStudent, aDozent, aDozent2, aPerson, aPerson2 };
		
//		for (Person p : personArray)
//			System.out.println(p);
		
		System.out.println(aStudent.toString());
	}

}
