package de.hsc.sose.interaction.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input implements IInput {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public int readInt() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Illegal input type, expected: integer");
            e.fillInStackTrace();
            scanner.nextLine();
            return readInt();
        }
    }

    @Override
    public double readDouble() {
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Illegal input type, expected: double");
            e.fillInStackTrace();
            scanner.nextLine();
            return readDouble();
        }
    }

    @Override
    public String readString() {
        try {
            return scanner.next();
        } catch (Exception e) {
            System.out.println("Illegal input type, expected: string");
            e.fillInStackTrace();
            scanner.nextLine();
            return readString();
        }
    }
}
