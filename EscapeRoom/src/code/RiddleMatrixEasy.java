package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RiddleMatrixEasy {// verrückt spalten um angegebene distance
	void rotateColumn(int colNumber, int distance) {
		List<String> column = new ArrayList<String>();
		int arrayListSize = 0;
		// Anzahl der ArrayListen im multidimensionalen Array
		for (ArrayList<String> s : matrix)
			arrayListSize++;
		// fügt von jeder Zeile den Spaltenwert in die Liste column ein
		for (int counter = 0; counter < arrayListSize; counter++)
			column.add(matrix.get(counter).get(colNumber));

		Collections.rotate(column, distance);

		for (int counter = 0; counter < arrayListSize; counter++)
			matrix.get(counter).set(colNumber, column.get(counter));

	}

	// gibt bei angabe die der colNumber die spalte als Liste wieder
	public List<String> getColumn(int colNumber) {
		List<String> column = new ArrayList<String>();
		int arrayListSize = getMatrixSize();

		// fügt von jeder Zeile den Spaltenwert in die Liste column ein
		for (int counter = 0; counter < arrayListSize; counter++)
			column.add((matrix.get(counter)).get(colNumber));

		return column;
	}

	// CHECKLATER
	// setzt in matrix die werte in spalte, durch werte der list
	void setColumn(List<String> list, int spalte) {
		int matrixSize = getMatrixSize();
		List<String> placeHolder = new ArrayList<String>();
		for (int i = 0; i < matrixSize; i++) {
//			for(int n = 0; n<searchedWord.length();n++) {
//				
//			}
			placeHolder = matrix.get(i);
			placeHolder.remove(spalte);
			placeHolder.add(spalte, list.remove(0));
			matrix.remove(i);
			matrix.add(i, (ArrayList<String>) placeHolder);
		}

	}

	// bestimmt größe der Liste
	int getMatrixSize() {
		int arrayListSize = 0;
		for (ArrayList<String> s : matrix)
			arrayListSize++;
		return arrayListSize;
	}

	List<String> arrayToList(String[] array) {
		List<String> stringList = new ArrayList<String>();
		if (array.length == 0)
			stringList = null;
		else {
			for (int i = 0; i < array.length; i++)
				stringList.add(array[i]);
		}
		return stringList;

	}

	// returnt liste mit Wörtern aus Eingabe array, keine Duplikate, füllt ebenfalls
	List<String> fillListWithWords(String[] array, int amount) {
		words2 = arrayToList(hints);
		String hintToAdd;
		List<String> wordsOptions = new ArrayList<String>();
		List<String> chosenWords = new ArrayList<String>();
		String wordToAdd;
		int position;
		wordsOptions = arrayToList(array);
		if (amount == array.length) {
			chosenWords.addAll(arrayToList(array));
			hintsForChosenWords = words2;
		}
		else
			for (int i = 0; i < amount; i++) {
				position = (int) (Math.random() * (wordsOptions.size()));
				hintToAdd = words2.remove(position);
				wordToAdd = wordsOptions.remove(position);
//				wordsOptions.remove(position);
				chosenWords.add(wordToAdd);
				hintsForChosenWords.add(hintToAdd);
				
				
					
			}
		return chosenWords;
	}
//hints
	// mittleres Wort erkennung
	String toString(List<String> wordInRow) {
		String listToString = "";
		for (String s : wordInRow)
			listToString += s;
		return listToString;
	}

	// funktion die wahrheitswert zurückliefert, wenn Zeichensequenz in einer Spalte
	// oder Zeile vorhanden ist
	// input Zeile oder Spalte
	Boolean containsWordInOrder(ArrayList<String> listWithWordLetters, String wordForCheck) {
		String checkNeeded = toString(listWithWordLetters);
		if (wordForCheck.contains(checkNeeded))
			return true;
		else
			return false;
	}

	// funktion die Position der Sequenz zurückliefert
	List<Integer> locationOfSymbolSequence(List<String> test, String wordForCheck) {
		List<Integer> positionOfChars = new ArrayList<Integer>();
		String checkNeeded = toString(test);
		int firstPosition = checkNeeded.indexOf(wordForCheck);
		int wordLength = wordForCheck.length();
		positionOfChars.add(firstPosition);
		for (int i = 1; i < wordLength; i++)
			positionOfChars.add(firstPosition + i);
		return positionOfChars;
	}

	String[] listToStringArray(List<String> list) {
		String[] placeHolder = new String[list.size()];
		for (int i = 0; i < list.size(); i++)
			placeHolder[0] = list.get(0);
		return placeHolder;
	}

	String[] StringToStringArray(String s) {
		String[] placeHolder = new String[s.length()];
		for (int i = 0; i < s.length(); i++)
			placeHolder[i] = "" + s.charAt(i);
		return placeHolder;
	}

	
	void crossOut(String[] chosenWordsArray) {
		List<String> temp = new ArrayList<String>();
		String listAsString;
		int positionOfHint;
		int wordLength;
		String wordReplacement;
		for (int counter = 0; counter < chosenWordsArray.length; counter++) {

			for (int i = 0; i < spalten; i++) {
				wordReplacement = "";
				temp = getColumn(i);
				listAsString = toString(temp);
				wordLength = (chosenWordsArray[counter]).length();
				if (listAsString.contains(chosenWordsArray[counter])) {
					if (listAsString.contains(searchedWord)) // Gelbe Zeile wird entfernt wenn Hauptwort gefunden wurde
						mainWordFound = true;
					positionOfHint = chosenWords.indexOf(chosenWordsArray[counter]);
					hintsForChosenWords.remove(positionOfHint);
					wordsLeft.remove(chosenWordsArray[counter]); // Gefundenes Wort wird aus übrigen Wörtern entfernt
					for (int anotherCounter = 0; anotherCounter < wordLength; anotherCounter++)
						wordReplacement += "*";
					listAsString = listAsString.replace(chosenWordsArray[counter], wordReplacement);
					temp = arrayToList(StringToStringArray(listAsString));
					setColumn(temp, i);
				}
			}

			for (int i = 0; i < zeilen; i++) {
				wordReplacement = "";
				temp = matrix.get(i);
				listAsString = toString(temp);
				wordLength = (chosenWordsArray[counter]).length();
				if (listAsString.contains(chosenWordsArray[counter])) {
					if (listAsString.contains(searchedWord))
						mainWordFound = true;
					positionOfHint = chosenWords.indexOf(chosenWordsArray[counter]);
					hintsForChosenWords.remove(positionOfHint);
					wordsLeft.remove(chosenWordsArray[counter]);
					for (int anotherCounter = 0; anotherCounter < wordLength; anotherCounter++)
						wordReplacement += "*";
					listAsString = listAsString.replace(chosenWordsArray[counter], wordReplacement);
					temp = arrayToList(StringToStringArray(listAsString));
					matrix.remove(i);
					matrix.add(i, (ArrayList<String>) temp);
				}
			}

		}

	}

	// --------------------------------------------------------------------

	String[] wordPool;

	public RiddleMatrixEasy() {
		this.wordPool = words;
	}

	Scanner sc = new Scanner(System.in);
//	private boolean isRunning = true;
	protected boolean mainWordFound = false;
	protected boolean isRunning = false;
	protected int counterRow, counterCol, amountOfWordsInRiddle, minSizeOfMatrix, zeilen, spalten,
			positionOfSearchedWordChars, input, points = 0, maxPoints = 0, counterRowForList = 0, moveDistance, gamemode, neededPoints, outputTime = 10;
	protected int colorRow; // Gelbe zeile soll ungefährt mittig sein;
	protected String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
			"T", "U", "V", "W", "X", "Y", "Z", "Ä", "Ö", "Ü", "ß", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	String[] words = { "Polymorphismus", "ruby", "computer", "informatik", "java", "python" };
	protected List<String> words2 = new ArrayList<String>();
	protected String[] hints = {"Der Bezeichner ist der Gleiche, jedoch die verwendeten Objekte unterschiedlich.....", "Eine Computersprache die den Namen wie ein Edelstein trägt!", "Ein alltäglich benutztes Gerät!", "Wie war nochmal unser Studiengang?", "Eine Computersprache, die wir seit über einem Semester lernen!", "Es existiert ein Tier mit demselben Namen!"};
	protected String[] chosenWordsArray;
	protected String[][] array;
	protected Boolean[][] freeSpace; // "Background map", um zu überprüfen, wo die Buchstaben des
									// Hauptwortes sind und wo der freie Platz für restliche,
									// benötigten Buchstaben ist
	protected String longestWord, secondLongestWord, searchedWord, direction;
	protected List<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();
	protected List<String> chosenWords = new ArrayList<String>();
	protected List<String> hintsForChosenWords= new ArrayList<String>();
	protected List<String> neededLetters = new ArrayList<String>(); // liste mit allen Buchstaben der ausgewählten Wörter
	protected List<String> wordsLeft = new ArrayList<String>();
	protected List<String> wordsFound = new ArrayList<String>();
	// wordPool Wörter nach upperCase

	void stringArrayToUpperCase() {

		for (counterRow = 0; counterRow < wordPool.length; counterRow++)
			wordPool[counterRow] = wordPool[counterRow].toUpperCase();
	}

	void amountOfWordsInRiddle() {
		amountOfWordsInRiddle = (int) (Math.random() * wordPool.length) + 1; // Anzahl der Wörter in Riddle
	}

	void chosenWords() {
		chosenWords = fillListWithWords(wordPool, amountOfWordsInRiddle); // Wörter die in Riddle auftauchen
		wordsLeft = chosenWords; // initialisierung der Strichliste
	}

	// Bubble Sort für Lists, nach Wort Länge Ascending
	void BubbleSortList() {
		String temp; // temporary holding area for swap
		String swap; // another variable for swap besides temp
		// array sorting
		// loop to control number of passes
		for (int pass = 0; pass < chosenWords.size(); pass++) {
			// loop to control number of comparisons
			for (int element = 0; element < chosenWords.size() - 1 - pass; element++) {
				// compare side-by-side elements and swap them if
				// first element is greater than second element
				if (chosenWords.get(element).length() > chosenWords.get(element + 1).length()) {
					temp = chosenWords.remove(element);
					swap = chosenWords.remove(element);
					chosenWords.add(element, temp);
					chosenWords.add(element, swap);
				}

			} // end loop to control comparisons

		} // end loop to control passes
	}

	void toStringArray() {
		int size = chosenWords.size();
		chosenWordsArray = new String[size]; //chosenWords.size() wurde hier durch size ersetzt!!
		for (int i = 0; i < size; i++)
			chosenWordsArray[i] = chosenWords.get(i);
	}

	void longestSecondLongestWord() {
		longestWord = chosenWords.get(chosenWords.size() - 1);
		if (chosenWords.size() > 1)
			secondLongestWord = chosenWords.get(chosenWords.size() - 2);
		else
			secondLongestWord = longestWord;
		// längstes Wort = main gesuchtes Wort(gelb)
		searchedWord = longestWord.toUpperCase();
	}
	// Zerlegt einen List<String> in einen List<String> mit jeweils den einzelnen
	// Buchstaben der ganzen Strings der ursprünglichen Liste
	void stringListToCharList() {
		String allStrings = "";
		String character;

		// da größtes Wort, main Wort ist, ist es nicht dabei
		for (int i = 0; i < chosenWords.size() - 1; i++) {
			allStrings = allStrings + chosenWords.get(i);
		}

		for (int i = 0; i < allStrings.length(); i++) {
			character = "" + allStrings.charAt(i);
			neededLetters.add(character);

		}

	}

	void minSizeOfMatrix() {
		minSizeOfMatrix = neededLetters.size() + searchedWord.length();
		spalten = searchedWord.length() + 7;
		// genügt größe Zeilen*spalten auch? Wenn nicht -> Anpassung
		if (((secondLongestWord.length()) * (searchedWord.length()) >= minSizeOfMatrix) && secondLongestWord.length() >= chosenWords.size()) {
			zeilen = longestWord.length() + chosenWords.size();
			// wenn in Riddle nur ein Wort gesucht ist, dann ist Zeilen und Spaltenzahl
			// gleich groß (Größe von longestword) spalten = searchedWord.length();

		} else {

			zeilen = chosenWords.size() + minSizeOfMatrix / spalten + chosenWords.size();

		}
		
		colorRow = (int) zeilen / 2; //colorrow hier
		array = new String[zeilen][spalten];
		freeSpace = new Boolean[zeilen][spalten];
	}

	void fillMatrixWithRandomValues() {
		for (counterRow = 0; counterRow < zeilen; counterRow++) // füllt die Zellen der Matrix mit zufälligen Werten aus
			// "letters"
			for (counterCol = 0; counterCol < spalten; counterCol++) {
				array[counterRow][counterCol] = letters[(int) (Math.random() * letters.length)];
				freeSpace[counterRow][counterCol] = true;
			}
		
		//random auswählen, ob in reihe oder Spalte plus auch zwei Wörter in Reihe oder Spalte möglich machen
		//experimentell
//				for(int i = 0; i<chosenWordsArray.length;i++) {
//					int inZeile, spaceLeft, firstCharPosition;
//					do {
//					inZeile =(int)( Math.random()*zeilen);
//					spaceLeft = spalten - chosenWordsArray[i].length();
//					firstCharPosition = spaceLeft-(int)(Math.random()*(spaceLeft+1));
//					
//					}while(freeSpaceZeilenCheck(inZeile));
//					
//					for(int counterCol = 0; counterCol<chosenWordsArray[i].length(); counterCol++) {
//						String charToString = ""+chosenWordsArray[i].charAt(counterCol);
//						array[inZeile][counterCol+firstCharPosition] = charToString;
//						freeSpace[inZeile][counterCol+firstCharPosition] = false;
//					}
//				}
				
				
				for(int i = 0; i<chosenWordsArray.length;i++) {
					int inSpalte, spaceLeft, firstCharPosition;
					do {
					inSpalte =(int)( Math.random()*spalten);
					spaceLeft = zeilen- chosenWordsArray[i].length();
					firstCharPosition = spaceLeft-(int)(Math.random()*(spaceLeft+1));
					
					}while(freeSpaceSpaltenCheck(inSpalte));
					
					for(int counterRow = 0; counterRow<chosenWordsArray[i].length(); counterRow++) {
						String charToString = ""+chosenWordsArray[i].charAt(counterRow);
						array[counterRow+firstCharPosition][inSpalte] = charToString;
						freeSpace[counterRow+firstCharPosition][inSpalte] = false;
					}
				}
				
				
				
				
				
				
				
				
				
				
				
				
				

		for (counterRow = 0; counterRow < zeilen; counterRow++) // füllt die Zellen der Matrix mit zufälligen Werten aus
			// "letters"
			for (counterCol = 0; counterCol < spalten; counterCol++) {
				if (freeSpace[counterRow][counterCol] == true & !neededLetters.isEmpty()) {
					int positionOfNeededLettersLeft = (int) (Math.random() * (neededLetters.size() - 1));
					array[counterRow][counterCol] = neededLetters.remove(positionOfNeededLettersLeft);
				}
			}


		for (counterRow = 0; counterRow < zeilen; counterRow++) { // array wird in matrix kopiert, matrix wird befüllt
			matrix.add(new ArrayList<String>());
			for (counterCol = 0; counterCol < spalten; counterCol++) {
				matrix.get(counterRow).add(counterCol, array[counterRow][counterCol]);
			}
		}
		System.out.println("");

	}
	boolean freeSpaceZeilenCheck(int zeile) {
		
			for(int col = 0; col<spalten;col++)
			if(freeSpace[zeile][col]==false)
				return true;
		
		return false;
	}
	boolean freeSpaceSpaltenCheck(int spalte) {
		
		for(int row = 0; row<zeilen;row++)
		if(freeSpace[row][spalte]==false)
			return true;
	
	return false;
}
	void graphicOutput() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("---------------");
		System.out.println("|-_=>Hints<=_-|");
		System.out.println("---------------");
		
		for(int i = 0; i< hintsForChosenWords.size();i++) //Ausgabe der Hinweise
			System.out.println(hintsForChosenWords.get(i) + "\n");
		System.out.println("__________________________\n");
		counterRowForList = 0;
		
		for(int i = 0; i<(matrix.get(0).size());i++) {
		if(i == 0)
			System.out.print("   "+i+" ");
		else if(i<10)
			System.out.print(i+" ");
		else
			System.out.print(i);
		}
		System.out.println("\n");
		for (ArrayList<String> obj : matrix) { // grafische Ausgabe der matrix
			if(counterRowForList<10)
			System.out.print(counterRowForList + "  ");
			else
				System.out.print(counterRowForList + " ");
			ArrayList<String> temp = obj;
			for (String job : temp) {
				if (counterRowForList == colorRow) {
					try {
						Thread.sleep(outputTime);
					} catch (InterruptedException e) {

					}
					if (mainWordFound | gamemode == 0) {
						//wenn alle gefunden werden müsse, ergibt gelbe Zeile schließlich keinen Sinn!
						System.out.print(job + " ");
					} else
						System.err.print(job + " ");
				} else {
					try {
						Thread.sleep(outputTime);
					} catch (InterruptedException e) {

					}
					System.out.print(job + " ");
				}

			}
			if(!wordsFound.isEmpty() && counterRowForList<wordsFound.size())
				System.out.print("  "+ wordsFound.get(counterRowForList));
			
			System.out.println();
			++counterRowForList;
		}
		
		System.gc();

	}

	void userInput() {
		if(gamemode==1) {
			System.out.println("__________________________\n");
			System.out.println("Needed Points: " + neededPoints);
			System.out.println("your points: " + points +"\n");
			
			}
		System.out.println("________-=>INPUT<=________\n");
		System.out.print("Move row or column?: "); // wohin verschieben?
		direction = sc.next().toLowerCase();
		if (direction.equals("column")) {
			System.out.print("Enter column: "); // Verschiebung
			try {
				input = sc.nextInt(); }
				catch(InputMismatchException e) {
					System.out.println("Invalid input!");
					loop();
				};
			if (input < spalten && input >= 0) {
				System.out.print("Up or down: ");
				direction = sc.next();
				direction = direction.toLowerCase();
				System.out.print("Distance to move: ");
				
				try {
				moveDistance = Integer.parseInt(sc.next());
				}
				catch(NumberFormatException e) {
					System.out.println("Invalid input!");
					loop();
				}
				if (direction.equals("down"))
					rotateColumn(input, moveDistance);
				if (direction.equals("up"))
					rotateColumn(input, -moveDistance);
			}
		}

		if (direction.equals("row")) {
			System.out.println("Enter row: ");
			try {
			input = sc.nextInt(); }
			catch(InputMismatchException e) {
				System.out.println("Invalid input!");
				loop();
			}
			if (input < zeilen && input >= 0) {
				System.out.print("Left or right: ");
				direction = sc.next().toLowerCase();
				System.out.print("Distance to move: ");
				try {
					moveDistance = Integer.parseInt(sc.next());
					}
					catch(NumberFormatException e) {
						System.out.println("Invalid input!");
						loop();
					}
				if (direction.equals("right"))
					Collections.rotate(matrix.get(input), moveDistance);
				if (direction.equals("left"))
					Collections.rotate(matrix.get(input), -moveDistance);
			}

		}

	}
	
	

	
	//anderes Zeug ergänzen aus CrossOut
	//Berechnet Punktzahl
	void pointSystem(int counter) {
		if( (toString(matrix.get(colorRow)).equals(searchedWord)) && wordsLeft.contains(searchedWord)) {
			points += searchedWord.length()*10+searchedWord.length()*5;
			wordsFound.add(searchedWord);
		}
		if(wordsLeft.contains(chosenWordsArray[counter])) { //Punkte für jedes gefundene Wort (doppelt geht nicht, falls eines mehrmals auftaucht
			points += chosenWordsArray[counter].length()*10;
			wordsFound.add(chosenWordsArray[counter]);
		}
	}
	//name sagt alles
	void calculateMaxPoints() {
		if(chosenWords.size()>1)
		for(int i = 0; i<chosenWords.size()-1; i++)
			maxPoints += (chosenWords.get(i).length())*10;
		//Zusatzpunkte main Wort in gelber Zeile gebaut wird
		maxPoints += searchedWord.length()*10+searchedWord.length()*5;
		//Mindestpunktzahl
		neededPoints = (int)(maxPoints*3/5);
	}

	void ending() {
		
		
		if(gamemode == 0)
			System.out.println("Congratulations, you have outhacked Pfeiffert Defender");
		
		if(gamemode == 1) {
			System.out.println("Deine Anzahl an Compilerfehler: "+ points);
			System.out.println("Programme? Abgewehrt!");
		}
		
		
		sc.close();
		System.out.println("\n");
		
		
	}
	//verschiedene Abbruchbedinungen der Schleife
	boolean isRunning() {
		//find all words
		if(gamemode==0 && wordsLeft.isEmpty()) {
			isRunning = true;
		}
			
		//Punkte spiel
		if(gamemode==1 && points>neededPoints) {
			isRunning = true;
		}
			
		
		return isRunning;
	}
	
	//Ending muss angepasst werden + mode ausgaben
	//Anleitung, + Anime girls
	void intro() {
		
		String hinweisText = "Falls die Buchstaben-Matrix nicht richtig ausgegeben wird, gebe bei 'Move row or column' einen ungültigen Wert ein!"+"\nBaue die Lösungen zu den Hinweisen in der Matrix zusammen, das Rätsel ist selbsterklärend.";
		for(int i = 0; i<hinweisText.length();i++) {
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				
			
			}
			System.out.print(hinweisText.charAt(i));
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		
		String gameIntroText = null;
		
		if(gamemode == 0)
			 gameIntroText ="Du bist möchtest Pfeifferts computer eindringen?\nNur ein Problem du musst erst sein Passwort knacken. Finde alle Wörter! \n"
					+ "In einem Textdokument auf seinem Mac, findest du folgende Hinweise.";
		
		if(gamemode == 1) {
			gameIntroText="Oh nein, Pfeiffert Defender bereitet seine Programme vor, um deinen Zugriff abzuwehren.\nFinde die Begriffe, um Compilerfehler in seine Programme einzubauen" + "\nIn einem Textdokument auf seinem Mac, findest du folgende Hinweise.";
			calculateMaxPoints();
			
		}
		for(int i = 0; i<gameIntroText.length();i++) {
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				
			
			}
			System.out.print(gameIntroText.charAt(i));
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		//Intro Satz
	}
	
	void loop()  {
		while (!isRunning()) {
			//für Test
			
			userInput();
			
			crossOut(chosenWordsArray);

			graphicOutput();
		}
	}
	
	
	void run() {
//Wordlink, exceptions, punkte system machen, Bedingung ab wie vielen Punkten gewonnen; Punkte Compilerfehler nennen, um Programm zu crashen!!, different Intros bitpfeiffert und Hacking intro
		stringArrayToUpperCase();
		amountOfWordsInRiddle();
		chosenWords();
		System.out.println(chosenWords);
		
		BubbleSortList();
		toStringArray();
		longestSecondLongestWord();
		stringListToCharList();
		minSizeOfMatrix();
		fillMatrixWithRandomValues();
		System.out.println(zeilen);
		intro();
		crossOut(chosenWordsArray);
		graphicOutput();
		loop();
		ending();
	}
}
