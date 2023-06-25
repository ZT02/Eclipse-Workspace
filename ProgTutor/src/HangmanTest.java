import java.util.Scanner;

public class HangmanTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wie viele Leben möchtst du haben?:\n");
		int input = sc.nextInt();
		System.out.println("\n\n\n\n\n\n\n\n");
		Hangman spiel = new Hangman(input);

		spiel.run();

		sc.close();
	}

}
