package student;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// alle Attribute einzeln setzen und lesen (viel Schreibaufwand
		Student aStudent = new Student();
		System.out.println("Werte nach Erzeugen:" + aStudent.toString());

		aStudent.setVorname("Peter");
		aStudent.setNachname("Müller");
		aStudent.setHausnummer("32");
		aStudent.setOrt("Coburg");
		aStudent.setMatrikelNummer(4711899);
		aStudent.setStrassenname("Friedrich-Streib-Strasse");
		aStudent.setPostleitzahl(95698);

		System.out.println(aStudent.getVorname() + " " + aStudent.getNachname() + " " + aStudent.getHausnummer() + " "
				+ aStudent.getOrt() + " " + aStudent.getMatrikelNummer() + " " + aStudent.getStrassenname() + " "
				+ aStudent.getPostleitzahl());

// 		statt der getAbfrage einfacher 	
		System.out.println(aStudent.toString());

//      oder ganz einfach

		aStudent = new Student(55578932, "Hans", "Meier", "Am Anger", "34", "Coburg", 96050, 1000);
		System.out.println(aStudent.toString());

	}

}
