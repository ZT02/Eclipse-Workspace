package woertersammlung;

public class WordCollTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] chapter1 = { " Hello" };
		String[] chapter2= { "Thomas Mann, der j�ngere Bruder von Heinrich Mann (1871�1950), war Sohn des Kaufmanns und L�becker Senators Thomas Johann Heinrich Mann.",
							"Seine Mutter Julia (geborene da Silva-Bruhns) war m�tterlicherseits brasilianischer Herkunft. Aus der Ehe gingen noch die Kinder " ,
							"Julia (1877�1927, Freitod), Carla (1881�1910, Freitod) und Viktor (1890�1949) hervor. Die Familie z�hlte zu den ersten Kreisen L�becks. ",
				            "Seine Kindheit hat Thomas Mann sp�ter als �gehegt und gl�cklich� bezeichnet." ,
				            "1891 starb Thomas Manns Vater an Blasenkrebs. In seinem Testament hatte er verf�gt, Unternehmen und Wohnhaus in L�beck zu verkaufen.", 
				            "Die Erl�se wurden angelegt. Seiner Frau und den Kindern standen die Zinsen f�r ihren Lebensunterhalt zu.", 
				            "Thomas Mann schilderte seine Schulzeit als stumpfsinnig. Schon fr�h begann er zu schreiben und beteiligte sich 1893 mit Prosaskizzen" ,
				            "und Aufs�tzen an der von ihm mit herausgegebenen Sch�lerzeitschrift Der Fr�hlingssturm. Einen Brief an Frieda L. Hartenstein von 1889 unterschrieb", 
				            "der Vierzehnj�hrige mit �Thomas Mann. Lyrisch-dramatischer Dichter�. 1894 verlie� er als Obersekundaner vorzeitig das Katharineum zu L�beck und ging nach M�nchen,",
				            "wohin die Mutter schon ein Jahr zuvor mit den Geschwistern gezogen war.",
				            "Sein Vormund Krafft Tesdorpf, der seit dem Tod des Vaters f�r die noch nicht vollj�hrigen Kinder bestellt war, bestimmte, dass Thomas Mann nach dem Abgang von der Schule",
				            "einen b�rgerlichen Beruf ergreifen sollte. Er nahm deshalb eine Stelle als Volont�r in einer Feuerversicherungsgesellschaft an, obwohl die B�rot�tigkeit ihn langweilte. ",
				            "Sein Deb�t als Schriftsteller gab er 1894 mit der Novelle Gefallen. Sie wurde in dem literarischen Magazin Die Gesellschaft ver�ffentlicht, die schon 1893 sein Gedicht ", 
				            "Zweimaliger Abschied publiziert hatte. Daraufhin wurden ihm weitere Ver�ffentlichungen in der Kunstzeitschrift Pan angeboten.[1]",
				            "Aufgrund dieses ersten Erfolges k�ndigte Thomas Mann 1895 seine T�tigkeit bei der Versicherungsgesellschaft und begann, Vorlesungen",
				            "an der Technischen Hochschule M�nchen zu besuchen, um sp�ter einen journalistischen Beruf auszu�ben.",
				            "1896 war er mit 21 Jahren vollj�hrig geworden und erhielt monatlich 180 Goldmark aus den Zinsen des v�terlichen Verm�gens,",
				            "was ihm ein Leben als freier Schriftsteller erm�glichte. Von 1895 bis 1896 verfasste Thomas Mann Beitr�ge f�r die nationalkonservative ",
				            "Monatsschrift �Das Zwanzigste Jahrhundert � Bl�tter f�r deutsche Art und Wohlfahrt�, deren zeitweiliger Herausgeber Heinrich Mann war." };
		String[] chapter3 = { "Thomas Mann , der j�ngere"  ,
							"Bruder von Heinrich Mann (1871�1950)"};
		WordCollUntyped wColl = new WordCollUntyped(chapter1);
		System.out.println(wColl);
		System.out.println("Top Word is " + wColl.top());
		
		wColl.append(chapter2);
		System.out.println(wColl);
		System.out.println("Top Word is " + wColl.top());
		
		wColl  = new WordCollUntyped(chapter3);
		System.out.println(wColl);
		System.out.println("Top Word is " + wColl.top());
		
		
		
		
		
		
		
		
		

	}

}
