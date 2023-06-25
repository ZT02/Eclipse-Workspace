
import java.util.InputMismatchException;
import java.util.Scanner;

public class GhostGame extends Level{
	private int ghost = 1;
	private int score = 0;
	private int tuer;
	
	private boolean running = true;
	private boolean wrong = false;
	Scanner sc = new Scanner(System.in);

	public GhostGame(int life, int doors) {
		super(life);
		this.tuer = doors;
		
	}

	public void printIntro() {

		System.out.println("Squid Games!");

	}

	public void run() {
		printIntro();
		while (isRunning()) {
			chooseDoor();
			checkDoor();
			

				
					

				

			}
		System.out.println("ENDE dein Score: " + getScore());
		sc.next();
		sc.close();
		}
	

	void chooseDoor() {
		ghost = (int) (Math.random() * 3 + 1);
		System.out.println("Wählen Sie eine Tür: ");

		do {
			try {
				tuer = getUserInput(sc);
				wrong = false;
			} catch (NoDoorException e) {
				System.out.println("Was glaubst du eigentlich was du hier machst? Versuchs nochmal.");
				wrong = true;
			}
		} while (wrong);
	}

	void checkDoor() {
		if (tuer != ghost) {
			score++;
			System.out.println("Sehr gut ;) traust du dich weiter zu gehen?");
		} else {
			System.out.print("BUH! MUHAHAHAHAHAHAHAA. Ps du bist tot.");
			setLife(getLife()-1);
			if (getLife() <= 0)
				running = false;
			System.out.println(" Leben: " + getLife());
		}
	}

	int getScore() {
		return score;
	}

	boolean isRunning() {
		return running;
	}

	private static int getUserInput(Scanner sc) throws NoDoorException {
		int x;
		try {
			x = sc.nextInt();
		} catch (InputMismatchException e) {
			sc.next();
			throw new NoDoorException();
		}

		if (x < 1 || x > 3)
			throw new NoDoorException();
		return x;
	}
}
