package de.hsc.sose.escaperoom.riddle;

import de.hsc.sose.interaction.util.InOut;

import java.util.Random;

public class ScrabblerRiddle implements IRiddle {

    private final String solution;
    private final char[] letters;
    private final Random random;
    private final SymbolMatrix scrabbler;
    private final InOut inOut;

    public ScrabblerRiddle(InOut inOut, final String solution) {
        this.solution = solution;
        this.letters = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        this.random = new Random();
        this.scrabbler = createMatrix();
        this.inOut = inOut;
    }

    //prints introduction, waits for user-input and returns whether Riddle got solved or not
    @Override
    public boolean showAndSolveRiddle() {
        String saveInput;
        inOut.print("""
                Hier hat sich ein Wort versteckt, kannst du es finden?
                Bringe es in eine Zeile/Spalte indem du die Zeilen und Spalten jeweils nach unten oder oben verschiebst.
                Du kannst nur so oft drehen, wie das Wort lang ist. Sonst musst du von vorne beginnen und dir wird ein Leben abgezogen.
                Info: Die erste Zeile/Spalte beginnt mit 0
                """);
        inOut.print(scrabbler.toString());
        for (int i = 0; i < solution.length(); i++) {
            inOut.print("Möchtest du 'row' oder 'column' verschieben?");
            saveInput = inOut.readString();
            if (saveInput.equals("row")) {
                inOut.print("Welche Zeile möchtest du rotieren lassen? Und wohin?");
                scrabbler.rotateRow(inOut.readInt(), inOut.readInt());
                inOut.print(scrabbler.toString());
                if (scrabbler.contains(solution))
                    return true;
            } else if (saveInput.equals("column")) {
                inOut.print("Welche Spalte möchtest du rotieren lassen? Und wohin?");
                scrabbler.rotateColumn(inOut.readInt(), inOut.readInt());
                inOut.print(scrabbler.toString());
                if (scrabbler.contains(solution))
                    return true;
            }
        }
        return false;
    }

    //fills matrix with solution and random characters
    private SymbolMatrix createMatrix() {

        final int columns = solution.length() + createRandom(10);
        final int rows = solution.length() + createRandom(10);
        final char[][] characters = new char[rows][columns];
        final boolean showWordVertically = createRandom(100) % 2 == 0;
        int rowIdx;
        int columnIdx;
        if (showWordVertically) {
            rowIdx = createRandom(rows - solution.length());
            columnIdx = createRandom(columns);
        } else {
            rowIdx = createRandom(rows);
            columnIdx = createRandom(columns - solution.length());
        }
        final int initialCellIdx = createRandom((showWordVertically ? rows : columns) - solution.length());
        for (int counter = initialCellIdx; counter < solution.length() + initialCellIdx; counter++) {
            characters[rowIdx][columnIdx] = solution.charAt(counter - initialCellIdx);
            if (showWordVertically) {
                rowIdx++;
                columnIdx = createRandom(columns);
            } else {
                rowIdx = createRandom(rows);
                columnIdx++;
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (characters[row][column] == 0) {
                    final var letterIndex = createRandom(letters.length);
                    characters[row][column] = letters[letterIndex];
                }
            }
        }
        return new SymbolMatrix(characters);
    }

    private int createRandom(final int maxValue) {
        if (maxValue == 0) return 1;
        return random.nextInt(maxValue);
    }
}
