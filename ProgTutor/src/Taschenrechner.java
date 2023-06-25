
import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;

		System.out.println("Pls type in 1st number:");
		int a = sc.nextInt();
		System.out.println("Pls type in 2nd number:");
		int b = sc.nextInt();

		System.out.println("What do you wanna? \n1: + \n2: - \n3: * \n4: /");
		int operator = sc.nextInt();

		switch (operator) {
		case 1:
			result = a + b;
			System.out.println(result);
			break;
		case 2:
			result = a - b;
			System.out.println(result);
			break;
		case 3:
			result = a * b;
			System.out.println(result);
			break;
		case 4:
			if (b > 0) {
				result = a / b;
				System.out.println(result);
			} else
				System.out.println("You can't divide by 0.");
			break;
		}

		sc.close();

	}

}
