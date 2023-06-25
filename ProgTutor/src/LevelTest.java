 import java.util.Scanner;

public class LevelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level[] allMode = {new GhostGame(3, 5), new Hangman(5), new NumberGuess(5)};
		Scanner sc = new Scanner(System.in);
		System.out.println("Welches Spiel möchtest du spielen? GhostGame, Hangman, NumberGuess oder 'all'");
		String input = sc.nextLine();
		input = input.toLowerCase();
		
		if(input.equals("ghostgame"))
			(new GhostGame(3, 5)).run();
		else if(input.equals("hangman"))
			(new Hangman(5)).run();
		else if(input.equals("numberguess"))
			(new NumberGuess(5)).run();
		else if(input.equals("all"))
			for(int i = 0; i<allMode.length; i++) {
				 allMode[i].run();
			}
		sc.close();
	}

}
