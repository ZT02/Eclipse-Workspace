
import java.util.Scanner;

public class Hangman extends Level{
	Scanner sc = new Scanner(System.in); // for user input

	
	private char guess; // the letter player 2 guesses
	private String censoredWord = "";
	private String word;
	private String input = ""; // variable for String guesses
	private StringBuilder sb = new StringBuilder(censoredWord);
	private boolean rightGuess = false; // checks if letter was in word or not
	private boolean running = true; // is true if game is still running

	public Hangman(int life) {
		super(life);// amount of tries
	
	}

	void inputCword() {
		// Player 1 creates a Word the other Player has to guess
		System.out.println("Player 1, please type in the word: ");
		String word = sc.next();
		word = word.toLowerCase(); // makes sure Capitalization doesn't matter
		this.word = word;
		// I can not flush the console so.. this is the better option
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	void playerTwoInstructions() {
		// Instructions for Player 2 and output of the Word he has to guess (but
		// censored bc.. you know)
		System.out.println(
				"Player 2 it's your turn! What is the word? Guess it letter by letter! \nDo not scroll up. That would be ... well shit.");

	}

	void censoreWord() {
		// StringBuilder so you can manipulate the censoredWord, without creating a new
		// String

		// creating the censored version of the word
		for (int i = 0; i < word.length(); i++) {
			sb.append('*');
		}
		censoredWord = sb.toString();
	}

	void guess() {
		do {
			System.out.println(censoredWord);
			System.out.println("Take a guess: ");

			// Guess of Player 2
			input = sc.next();

			// check if Player entered a letter or a whole word
			if (input.length() == 1) // if input has length 1 -> single letter
			{
				guess = input.toLowerCase().charAt(0); // convert String to char, plus toggle Capitalization

				// iteration throughout the word
				for (int i = 0; i < word.length(); i++) {
					// check if guessed letter matches the letter at index i
					if (guess == word.charAt(i)) {
						// if yes, the censored version of the word is being updated
						sb.setCharAt(i, guess);
						censoredWord = sb.toString();
						rightGuess = true; // guess was right so: true.
					}
				}

				// if rightGuess is false, you loose a life
				if (!rightGuess) {
					loseLife();
				}

				// Output of UPDATED censored version plus the lives you have left
				System.out.println("\nLife: " + 		getLife() + "\n");

				rightGuess = false;
				if (censoredWord.contains("*")) {
					running = true;
				} else
					running = false;
				lifeCheck();
			} else {
				if (!input.equals(word)) {
					loseLife();
					lifeCheck();
				} else {
					running = false;
					sb.replace(0, word.length(), word);
					censoredWord = sb.toString();
				}

			}

		} while (running);
	}

	void loseLife() {
		setLife(getLife()-1);;
		System.out.println("\nWhoooooops - you just lost a life..\n");
	}

	void lifeCheck() {
		if (		getLife() <= 0)
			running = false;
	}
	// The Guesses

	void finalCheck() {
		if (!censoredWord.contains("*")) {
			System.out.println("\nCongratulations, you escaped your funeral. ");
		} else
			System.out.println("\nOh damn, GAME OVER! The word was " + word);

	}

	public boolean isRunning() {
		return running;
	}

	public void run() {
		while (isRunning()) {
			inputCword();
			playerTwoInstructions();
			censoreWord();
			guess();
			finalCheck();
		}
		sc.next();
		sc.close();
	}

}
