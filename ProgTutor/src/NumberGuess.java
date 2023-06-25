
import java.util.Scanner;

public class NumberGuess extends Level{
	// Scanner for user input
	Scanner input = new Scanner(System.in);
	// generating a random number between 1 and 50
	private int random = (int) (Math.random() * 50 + 1);
	// declaration and initialization of variables
	private int guess = 0;
	private boolean running = true;
	public NumberGuess(int life) {
		super(life);
	}
	void takeGuess() { // Ask user for guess
		System.out.println("Take a guess!");
		guess = input.nextInt();
	}

	void smallerGuess() {
		// 1. Case: Guess is smaller than the random number
		if (guess < random) {
			// Guess was wrong so: 1 hp less
			setLife(getLife()-1);
			System.out.println("Nope, the number is bigger. HP: " + getLife());
			// check if user still have hp, if no: no more loop after this one
			if (getLife() == 0)
				running = false;
		}
	}

	void biggerGuess() {
		// 2. Case: Guess is bigger than random number
		if (guess > random) {
			setLife(getLife()-1);
			System.out.println("Nice try, but no. The number is smaller. HP: " + getLife());
			if (getLife() == 0)
				running = false;
		}
	}

	void correctGuess() {
		// 3. Case: Guess is right
		if (guess == random) {
			System.out.println("Whohooo! You won!");
			running = false;
		}
	}

	void wrongGuessAndNoHP() {
		// 4. Case: Guess is wrong AND user has no hp left
		if (guess != random)
			System.out.println("GAME OVER \nThe number searched was " + random);
		input.next();
		input.close();
	}

	public void run() {
		while (running) {
			takeGuess();
			smallerGuess();
			biggerGuess();
			correctGuess();
		}
			wrongGuessAndNoHP();
			
		
	}

}
